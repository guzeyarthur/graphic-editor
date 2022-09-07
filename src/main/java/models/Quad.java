package models;

public class Quad extends Shape{

    private static final String TYPE_OF_SHAPE = "Quad - ";

    public Quad(String name) {
        super(name);
    }

    @Override
    protected String getTypeOfShape() {
        return TYPE_OF_SHAPE;
    }

}
