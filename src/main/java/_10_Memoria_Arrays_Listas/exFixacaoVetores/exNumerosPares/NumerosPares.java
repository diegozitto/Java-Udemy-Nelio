package _10_Memoria_Arrays_Listas.exFixacaoVetores.exNumerosPares;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia N números inteiros e armazene-os em um vetor.
 * Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.
 */

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos númmeros pares você vai digitar?");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        int contadorPares = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                contadorPares++;
            }
        }

        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d", contadorPares);
        sc.close();
    }
}
