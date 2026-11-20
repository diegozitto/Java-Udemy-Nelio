package _13_Heranca_Polimorfismo.exAbstrato.metodos.entities;

import _13_Heranca_Polimorfismo.exAbstrato.metodos.entities.enums.Color;

public class Rectangle extends Shape{
    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }
}