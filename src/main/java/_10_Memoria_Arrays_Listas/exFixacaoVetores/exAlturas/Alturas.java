package _10_Memoria_Arrays_Listas.exFixacaoVetores.exAlturas;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
 * Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem
 * de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
 */
public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos pessoas serão digitadas?");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados %da pessoa:%n",i+1);
            sc.nextLine();

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Idade: ");
            int idade = sc.nextInt();

            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome,idade,altura);
        }

        double alturaMedia = 0;
        double soma = 0;

        for(Pessoa pessoas : vect){
            soma += pessoas.getAltura();
        }
            alturaMedia = soma /vect.length;

        System.out.printf("Altura média: %.2f%n",alturaMedia);

        int tamanho = 0;
        for(Pessoa pessoas : vect){
           if (pessoas.getIdade() < 16){
               tamanho++;
           }
        }
        double porcentagem = (tamanho * 100.00) /vect.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcentagem);

        for(Pessoa pessoas : vect){
            if (pessoas.getIdade() < 16){
                System.out.println(pessoas.getNome());
            }
        }

        sc.close();
    }
}
