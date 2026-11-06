package _10_Memoria_Arrays_Listas.exFixacaoMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int m = 0, n = 0, x = 0;

        m = sc.nextInt();
        n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Qual número está procurando?");
        x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.printf("Position %d,%d: %n", i, j);
                    if (j > 0) {
                        System.out.printf("Left: %d%n", matriz[i][j - 1]);
                    }
                    if (j < n - 1) {
                        System.out.printf("Right: %d%n", matriz[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.printf("Up: %d%n", matriz[i - 1][j]);
                    }
                    if (i < m - 1) {
                        System.out.printf("Down: %d%n", matriz[i + 1][j]);

                    }
                }
            }
        }


        sc.close();

    }
}
