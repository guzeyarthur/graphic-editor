package models;

public class Triangle extends Shape{

    private static final String TYPE_OF_SHAPE = "Triangle - ";

    public Triangle(String name) {
        super(name);
    }

    @Override
    protected String getTypeOfShape() {
        return TYPE_OF_SHAPE;
    }

}
