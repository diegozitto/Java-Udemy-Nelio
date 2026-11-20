package _13_Heranca_Polimorfismo.exAbstrato.metodos.entities;

import _13_Heranca_Polimorfismo.exAbstrato.metodos.entities.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();

}