package _13_Heranca_Polimorfismo.exAbstrato.metodos.entities;

import _13_Heranca_Polimorfismo.exAbstrato.metodos.entities.enums.Color;

public class Circle extends Shape{
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
}