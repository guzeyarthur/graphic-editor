package models;

import constants.StringConstantShape;

public class Circle extends Shape{

    public Circle(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(StringConstantShape.CIRCLE+super.name);
    }
}
