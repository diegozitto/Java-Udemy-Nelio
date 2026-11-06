package _9_Construtores_This_Sobrecarga_Encapsulamento.encapsulamento.exemploEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque os detalhes do produto:");

        System.out.print("Nome:");
        String nome = sc.next();

        System.out.print("Preco:");
        double preco = sc.nextDouble();

        Produto produto = new Produto(nome,preco);

        System.out.println("Dados do produto: " + produto.toString());

        System.out.print("Insira o numero de produtos que serão adicionados ao estoque:");
        int valor = sc.nextInt();
        produto.addProduto(valor);

        System.out.println("Dados atualizado: " + produto.toString());

        System.out.print("Insira o numero de produtos que serão removidos do estoque:");
        valor = sc.nextInt();
        produto.removerProduto(valor);

        System.out.println(produto.toString());

        sc.close();
    }
}
