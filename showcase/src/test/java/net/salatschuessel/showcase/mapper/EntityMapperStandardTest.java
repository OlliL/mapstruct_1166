package net.salatschuessel.showcase.mapper;

import org.junit.jupiter.api.Test;

class EntityMapperStandardTest extends AbstractTest {

    final EntityMapperStandardImpl mapper = new EntityMapperStandardImpl();

    @Test
    void sourceIdNull_targIdObjectIsNull() {
        super.executeTest(this.mapper::mapEntity);
    }

}
