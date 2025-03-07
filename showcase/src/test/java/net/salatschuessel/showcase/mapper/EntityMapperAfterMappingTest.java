package net.salatschuessel.showcase.mapper;

import org.junit.jupiter.api.Test;

class EntityMapperAfterMappingTest extends AbstractTest {

    EntityMapperAfterMappingImpl mapper = new EntityMapperAfterMappingImpl();

    @Test
    void sourceIdNull_targIdObjectIsNull() {
        super.executeTest(this.mapper::mapEntity);
    }

}
