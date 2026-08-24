package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.*;
import entities.enums.Color;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)?");
            char shape = sc.next().charAt(0);
            System.out.print("Entrer shape's color (BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.next());

            if (shape == 'r') {
                System.out.print("Entrer rectangle's width: ");
                double width = sc.nextDouble();
                System.out.print("Entrer rectangle's height: ");
                double height = sc.nextDouble();

                shapeList.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Entrer circle's radius: ");
                double radius = sc.nextDouble();

                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapeList) {
            System.out.printf("%.2f%n", shape.area());
        }
        sc.close();
    }
}