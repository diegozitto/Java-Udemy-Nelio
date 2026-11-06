package _8_IntroducaoOrientacaoObjetos.membrosEstaticos.circunferencia.modo3.application;

import _8_IntroducaoOrientacaoObjetos.membrosEstaticos.circunferencia.modo3.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        Calculator calc = new Calculator(); --> Não precisa mais ser instanciada

        System.out.println("Insira valor de raio:");
        double raio = sc.nextDouble();

        double c = Calculator.circunferencia(raio);
//        double c = calc.circunferencia(raio); --> antes
        double v = Calculator.volume(raio);
//        double v = calc.volume(raio); --> antes

        System.out.printf("Circunferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n",Calculator.PI);
//        System.out.printf("Valor de PI: %.2f%n",calc.PI); --> antes

        sc.close();
    }

}
