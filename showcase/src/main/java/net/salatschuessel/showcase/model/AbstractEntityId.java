package net.salatschuessel.showcase.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class AbstractEntityId<I extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1L;
    private final I value;

    protected AbstractEntityId(final I value) {
        this.value = value;
    }

    public final I getValue() {
        return this.value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AbstractEntityId<?> that = (AbstractEntityId<?>) o;
        return Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "id=" + this.value + '}';
    }
}