package models;

public class Polygon extends Shape {

    private static final String TYPE_OF_SHAPE = "Polygon - ";

    public Polygon(String name) {
        super(name);
    }

    @Override
    protected String getTypeOfShape() {
        return TYPE_OF_SHAPE;
    }

}
