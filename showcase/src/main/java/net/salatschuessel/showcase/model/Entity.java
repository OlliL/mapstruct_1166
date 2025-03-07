package net.salatschuessel.showcase.model;

public class Entity {

    private String label;
    private EntityIdFirst idFirst;
    private EntityIdSecond idSecond;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public EntityIdFirst getIdFirst() {
        return idFirst;
    }

    public void setIdFirst(EntityIdFirst idFirst) {
        this.idFirst = idFirst;
    }

    public EntityIdSecond getIdSecond() {
        return idSecond;
    }

    public void setIdSecond(EntityIdSecond idSecond) {
        this.idSecond = idSecond;
    }
}
