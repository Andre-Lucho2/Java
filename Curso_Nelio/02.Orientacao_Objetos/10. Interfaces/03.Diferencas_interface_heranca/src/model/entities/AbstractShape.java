package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {
    // por ser abstrata (NÃO INSTANCIADA), não implementa o(s) método(s) da
    // interface que está
    // implementando --> as classes concretas é que implementam a interface

    // o(s) método(s) da interface se tornam abstratos aqui

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
