package net.salatschuessel.showcase.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.TargetType;
import net.salatschuessel.showcase.model.AbstractEntityId;
import net.salatschuessel.showcase.model.Entity;
import net.salatschuessel.showcase.model.SourceModel;

@Mapper
public interface EntityMapperAfterMapping {

    @Mapping(target = "idFirst.value", source = "myFirstId", conditionQualifiedByName = "myFirstId")
    @Mapping(target = "idSecond.value", source = "mySecondId", conditionQualifiedByName = "mySecondId")
    Entity mapEntity(SourceModel source);

    @AfterMapping
    default <T extends AbstractEntityId<?>> T fixId(@MappingTarget final T id,
            @TargetType final Class<T> entityClass) {
        if (id != null && id.getValue() == null) {
            return null;
        }
        return id;
    }
}
