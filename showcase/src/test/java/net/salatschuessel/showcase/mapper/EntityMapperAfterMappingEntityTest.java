package net.salatschuessel.showcase.mapper;

import org.junit.jupiter.api.Test;

class EntityMapperAfterMappingEntityTest extends AbstractTest {

    EntityMapperAfterMappingEntityImpl mapper = new EntityMapperAfterMappingEntityImpl();

    @Test
    void sourceIdNull_targIdObjectIsNull() {
        super.executeTest(this.mapper::mapEntity);
    }

}
