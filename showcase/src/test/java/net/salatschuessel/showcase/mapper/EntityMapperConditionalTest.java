package net.salatschuessel.showcase.mapper;

import org.junit.jupiter.api.Test;

class EntityMapperConditionalTest extends AbstractTest {

    EntityMapperConditionalImpl mapper = new EntityMapperConditionalImpl();

    @Test
    void sourceIdNull_targIdObjectIsNull() {
        super.executeTest(this.mapper::mapEntity);
    }

}
