import models.*;
import utils.PrinterNameOfShape;

public class StartApp {
    public static void main(String[] args) {

        Shape[] shapes = {new Circle("circle1"), new Polygon("polygon1"), new Quad("quad1"),
                new Rectangular("rectangular1"), new Triangle("triangle1")};

        PrinterNameOfShape printerNameOfShape = new PrinterNameOfShape();

        for (int i=0; i< shapes.length; i++) {
            printerNameOfShape.printShape(shapes[i]);
        }

    }
}
