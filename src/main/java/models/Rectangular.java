package models;

public class Rectangular extends Shape{

    private static final String TYPE_OF_SHAPE = "Rectangular - ";

    public Rectangular(String name) {
        super(name);
    }

    @Override
    protected String getTypeOfShape() {
        return TYPE_OF_SHAPE;
    }

}
