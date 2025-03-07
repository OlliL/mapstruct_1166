package net.salatschuessel.showcase.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import net.salatschuessel.showcase.model.Entity;
import net.salatschuessel.showcase.model.SourceModel;

@Mapper
public interface EntityMapperStandard {

    @Mapping(target = "idFirst.value", source = "myFirstId")
    @Mapping(target = "idSecond.value", source = "mySecondId")
    Entity mapEntity(SourceModel source);
}
