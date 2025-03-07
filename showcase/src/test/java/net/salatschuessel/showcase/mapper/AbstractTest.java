package net.salatschuessel.showcase.mapper;

import java.util.function.Function;
import net.salatschuessel.showcase.model.Entity;
import net.salatschuessel.showcase.model.SourceModel;
import static org.junit.jupiter.api.Assertions.assertNull;

public abstract class AbstractTest {

    protected void executeTest(Function<SourceModel, Entity> mapperFunction) {
        final var source = new SourceModel();
        source.setLabel("label");
        source.setMyFirstId("myFirstId");

        final var target = mapperFunction.apply(source);

        assertNull(target.getIdSecond());
    }

}
