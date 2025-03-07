package net.salatschuessel.showcase.mapper;

import org.junit.jupiter.api.Test;

class EntityMappeStandardCheckNullTest extends AbstractTest {

    EntityMapperStandardCheckNullImpl mapper = new EntityMapperStandardCheckNullImpl();

    @Test
    void sourceIdNull_targIdObjectIsNull() {
        super.executeTest(this.mapper::mapEntity);
    }

}
