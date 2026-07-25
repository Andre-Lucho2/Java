package util;

public class Calculator {

    // Declarando membros de classe estático:
    // palavra reservada --> static

    public static final double PI = 3.14159;
    // a) Constante --> nome da variável toda Maiúscula - quando nome composto :
    // PI_VALUE
    // b) Invariável --> palavra reservada 'final'

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}
