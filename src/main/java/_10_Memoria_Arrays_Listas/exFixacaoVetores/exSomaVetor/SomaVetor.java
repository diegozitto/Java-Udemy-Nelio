package _10_Memoria_Arrays_Listas.exFixacaoVetores.exSomaVetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 */
public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar?");
        int n = sc.nextInt();
        double soma = 0.0;
        double media = 0.0;

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero:");
            sc.nextLine();
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        media = soma / vect.length;

        System.out.println("VALORES = " + Arrays.toString(vect));
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);


        sc.close();
    }
}
