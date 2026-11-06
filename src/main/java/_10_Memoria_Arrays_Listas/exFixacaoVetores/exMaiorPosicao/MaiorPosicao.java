package _10_Memoria_Arrays_Listas.exFixacaoVetores.exMaiorPosicao;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor.
 * Em seguida, mostrar na tela o maior número do vetor (supor não haver empates).
 * Mostrar também a posição do maior elemento, considerando a primeira posição
 * como 0 (zero).
 */
public class MaiorPosicao {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero:");
            vect[i] = sc.nextDouble();
        }

        double maiorPosicao = vect[0];
        int posicao = 0;

        for (int i = 0; i < vect.length; i++) {
           if (maiorPosicao < vect[i]){
               maiorPosicao = vect[i];
               posicao = i;
           }
        }

        System.out.println("MAIOR VALOR = " + maiorPosicao);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);


        sc.close();
    }
}
