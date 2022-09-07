package models;

public class Circle extends Shape{

    private static final String TYPE_OF_SHAPE = "Circle - ";

    public Circle(String name) {
        super(name);
    }

    @Override
    protected String getTypeOfShape() {
        return TYPE_OF_SHAPE;
    }


}
