package _8_IntroducaoOrientacaoObjetos.membrosEstaticos.exercicios.exDolar;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollarValue = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double dollarAmount = sc.nextDouble();
        double currencyConverter = CurrencyConverter.totalDolars(dollarValue,dollarAmount);
        System.out.printf("Amount to be paid in reais = %.2f", currencyConverter);

        sc.close();
    }
}
