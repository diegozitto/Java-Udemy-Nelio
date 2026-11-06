package _10_Memoria_Arrays_Listas.exemplos;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um número inteiro N e os dados (nome e preco) de N produtos.
// Armazene os N produtos em um vetor.
// Em seguida, mostrar o preco medio dos produtos.

public class ExeploVetoresComProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++ ){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produto(name,price);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++ ){
            soma += vect[i].getPreco();
        }

        double media = soma/vect.length;

        System.out.println("Average price = " + media);
        sc.close();
    }
}
