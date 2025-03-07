package net.salatschuessel.showcase.mapper;

import org.junit.jupiter.api.Test;

class EntityMapperSeperateTest extends AbstractTest {

    EntityMapperSeperateImpl mapper = new EntityMapperSeperateImpl();

    @Test
    void sourceIdNull_targIdObjectIsNull() {
        super.executeTest(this.mapper::mapEntity);
    }

}
