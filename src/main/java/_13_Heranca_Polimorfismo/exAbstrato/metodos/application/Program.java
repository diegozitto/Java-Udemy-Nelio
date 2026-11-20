package _13_Heranca_Polimorfismo.exAbstrato.metodos.application;

import _13_Heranca_Polimorfismo.exAbstrato.metodos.entities.Circle;
import _13_Heranca_Polimorfismo.exAbstrato.metodos.entities.Rectangle;
import _13_Heranca_Polimorfismo.exAbstrato.metodos.entities.Shape;
import _13_Heranca_Polimorfismo.exAbstrato.metodos.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Shape #%d data:%n",i+1);
            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());
            if (shape =='r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapes.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapes.add(new Circle(color,radius));
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapes){
            System.out.printf("%.2f%n",shape.area());
        }

        sc.close();
    }
}
