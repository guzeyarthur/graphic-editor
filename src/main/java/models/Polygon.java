package models;

import Constants.StringConstantShape;

public class Polygon extends Shape {
    public Polygon(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(StringConstantShape.POLYGON+super.name);
    }
}
