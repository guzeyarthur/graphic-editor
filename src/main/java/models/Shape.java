package models;

import constants.StringConstantShape;

public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(StringConstantShape.SHAPE+name);
    }
}
