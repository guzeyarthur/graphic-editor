package models;

import Constants.StringConstantShape;

public class Circle extends Shape{

    public Circle(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(StringConstantShape.CIRCLE+super.name);
    }
}
