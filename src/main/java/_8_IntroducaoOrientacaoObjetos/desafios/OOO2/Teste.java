package _8_IntroducaoOrientacaoObjetos.desafios.OOO2;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Altura e largura do retangulo: ");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.println("Area = " + retangulo.area());
        System.out.println("Perimetro = " + retangulo.perimetro());
        System.out.println("Diagonal = " + retangulo.diagonal());

        sc.close();

    }
}
