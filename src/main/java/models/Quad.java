package models;

import Constants.StringConstantShape;

public class Quad extends Shape{
    public Quad(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(StringConstantShape.QUAD+super.name);
    }
}
