package net.salatschuessel.showcase.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import net.salatschuessel.showcase.model.Entity;
import net.salatschuessel.showcase.model.EntityIdFirst;
import net.salatschuessel.showcase.model.EntityIdSecond;
import net.salatschuessel.showcase.model.SourceModel;

@Mapper
public interface EntityMapperSeperate {

    @Mapping(target = "idFirst", source = "myFirstId")
    @Mapping(target = "idSecond", source = "mySecondId")
    Entity mapEntity(SourceModel source);

    @Mapping(target = "value", source = "string")
    EntityIdFirst mapEntityIdFirst(String string);

    @Mapping(target = "value", source = "integer")
    EntityIdSecond mapEntityIdSecond(Integer integer);
}
