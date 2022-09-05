package models;

import constants.StringConstantShape;

public class Triangle extends Shape{

    public Triangle(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(StringConstantShape.TRIANGLE+super.name);
    }
}
