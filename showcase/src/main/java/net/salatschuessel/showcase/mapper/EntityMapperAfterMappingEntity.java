package net.salatschuessel.showcase.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import net.salatschuessel.showcase.model.Entity;
import net.salatschuessel.showcase.model.SourceModel;

@Mapper
public interface EntityMapperAfterMappingEntity {

    @Mapping(target = "idFirst.value", source = "myFirstId", conditionQualifiedByName = "myFirstId")
    @Mapping(target = "idSecond.value", source = "mySecondId", conditionQualifiedByName = "mySecondId")
    Entity mapEntity(SourceModel source);

    @AfterMapping
    default void fixId(@MappingTarget Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity.getIdFirst() != null && entity.getIdFirst().getValue() == null) {
            entity.setIdFirst(null);
        }
        if (entity.getIdSecond() != null && entity.getIdSecond().getValue() == null) {
            entity.setIdSecond(null);
        }
    }
}
