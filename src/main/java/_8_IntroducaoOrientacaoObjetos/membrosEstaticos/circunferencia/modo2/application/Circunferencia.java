package _8_IntroducaoOrientacaoObjetos.membrosEstaticos.circunferencia.modo2.application;

import _8_IntroducaoOrientacaoObjetos.membrosEstaticos.circunferencia.modo2.util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Insira valor de raio:");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);
        double v = calc.volume(raio);

        System.out.printf("Circunferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n",calc.PI);



        sc.close();
    }

}
