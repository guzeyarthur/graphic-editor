package models;

public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract protected String getTypeOfShape();

    public String print() {
        return this.getTypeOfShape() + this.name;
    }
}
