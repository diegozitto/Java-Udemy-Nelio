package _9_Construtores_This_Sobrecarga_Encapsulamento.exFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta1; // declarar antes para não ficar limitado

        System.out.println("Coloque o número da conta: ");
        int numeroDaConta = sc.nextInt();

        System.out.println("Coloque o nome do titular: ");
        sc.nextLine(); //está aqui para consumir a quebra de linha que sobrou do nextInt
        String titular = sc.nextLine();

        System.out.println("Será feito algum depósito inicial? (s/n)");
        char resposta = sc.next().charAt(0);

        if (resposta == 's'){
            System.out.println("Qual o valor?:");
            double depositoInicial = sc.nextDouble();
            conta1 = new Conta(titular,numeroDaConta,depositoInicial);
        } else {
            conta1 = new Conta(titular,numeroDaConta);
            System.out.println(conta1);
        }

        System.out.println("Selecione um valor para depósito: ");
        double valor = sc.nextDouble();
        conta1.deposito(valor);

        System.out.println("Selecione um valor para saque: ");
        valor = sc.nextDouble();
        conta1.saque(valor);


        sc.close();
    }
}
