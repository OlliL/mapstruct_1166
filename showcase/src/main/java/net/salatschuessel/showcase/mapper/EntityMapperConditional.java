package net.salatschuessel.showcase.mapper;

import org.mapstruct.Condition;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import net.salatschuessel.showcase.model.Entity;
import net.salatschuessel.showcase.model.SourceModel;

@Mapper
public interface EntityMapperConditional {

    @Mapping(target = "idFirst.value", source = "myFirstId", conditionQualifiedByName = "myFirstId")
    @Mapping(target = "idSecond.value", source = "mySecondId", conditionQualifiedByName = "mySecondId")
    Entity mapEntity(SourceModel source);

    @Condition
    @Named("myFirstId")
    default boolean conditionMyFirstId(SourceModel source) {
        return source != null && source.getMyFirstId() != null;
    }

    @Condition
    @Named("mySecondId")
    default boolean conditionMySecondId(SourceModel source) {
        return source != null && source.getMySecondId() != null;
    }
}
