package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {

    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Circle(2.0));
        myShapes.add(new Rectangle(2.0, 3.0));

        System.out.println("Total area= " + String.format("%.3f", totalArea(myShapes)));

        List<Circle> listCircle = new ArrayList<>();
        listCircle.add(new Circle(4.0));
        listCircle.add(new Circle(3.0));

        // a)
        // System.out.println("Total area= " + String.format("%.3f",
        // totalArea(listCircle)));
        // erro compilação --> List<Shape> não é um supertipo de List<Circle>

        // b)
        System.out.println("Total area= " + String.format("%.3f", totalArea2(listCircle)));

    }

    // a)
    public static double totalArea(List<Shape> list) {
        double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }

        return sum;

    }

    // b)
    // 1.) List<?> list --> erro --> o tipo ? pode não ser do tipo Shape
    // 2.) <? extends Shape> --> o tipo da List pode ser Shape ou qquer subtipo de
    // Shape
    public static double totalArea2(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }
        // list.add(new Rectangle(1.0, 2.0)); // Como a list é do tipo curinga(?) --> O
        // compilador não sabe qual é o tipo
        // de list foi instanciado.

        return sum;

    }

}
