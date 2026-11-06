package _10_Memoria_Arrays_Listas.desafioVetoresPensionato;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante[] quartos = new Estudante[10];

        int n = 0;

        do {
            System.out.println("Quantos quartos serão alugados?");
            n = sc.nextInt();
        } while (n <= 0 || n > 10);

        sc.nextLine();

        String nome, email;
        int quarto = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Aluguel #%d%n", i + 1);

            System.out.println("Nome: ");
            nome = sc.nextLine();

            System.out.println("Email: ");
            email = sc.nextLine();

            do {
                System.out.println("Quarto: ");
                quarto = sc.nextInt();

            } while (quarto < 0 || quarto >= 10 || quartos[quarto] != null);

            quartos[quarto] = new Estudante(nome, email);
            sc.nextLine();
        }

        System.out.println("Quartos ocupados:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}
