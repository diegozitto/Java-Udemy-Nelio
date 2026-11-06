package _10_Memoria_Arrays_Listas.exFixacaoVetores.exSomaVetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];
        int soma = 0;

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i=0; i<n; i++) {
            System.out.printf("%d\n", vectC[i]);
        }

        sc.close();
    }
}
