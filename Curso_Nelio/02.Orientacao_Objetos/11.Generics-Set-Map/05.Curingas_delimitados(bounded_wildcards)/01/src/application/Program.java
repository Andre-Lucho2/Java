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

        System.out.println("Total area= " + String.format("%.3f", totalArea(listCircle)));

    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }

        return sum;
    }

}
