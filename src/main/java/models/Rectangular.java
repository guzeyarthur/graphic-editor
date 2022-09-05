package models;

import constants.StringConstantShape;

public class Rectangular extends Shape{

    public Rectangular(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(StringConstantShape.RECTANGULAR+super.name);
    }
}
