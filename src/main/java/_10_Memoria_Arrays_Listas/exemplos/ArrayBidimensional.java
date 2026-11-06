package _10_Memoria_Arrays_Listas.exemplos;

import java.util.Scanner;

public class ArrayBidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        // Quantidade de lihas de uma matriz pode ser substituída por length
        // Quantidade de coluna de uma matriz pode ser substituída por [linhas].length
        // Pois uma matriz é um vetor de vetores, cada linha é um vetor com N elementos

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println(" ");

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative numbers = " + count);

        sc.close();
    }
}