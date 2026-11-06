package _8_IntroducaoOrientacaoObjetos.desafios.OOO1;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Coloque os detalhes do produto:");

        System.out.print("Nome:");
        produto.nome = sc.next();

        System.out.print("Preco:");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade em estoque:");
        produto.quantidade = sc.nextInt();

        System.out.printf("Dados do produto: %s, $ %.2f, %d unidades, Total: $ %.2f%n", produto.nome,produto.preco,produto.quantidade,produto.valorTotalEmEstoque());

        System.out.print("Insira o numero de produtos que serao adicionados ao estoque:");
        int valor = sc.nextInt();
        produto.addProduto(valor);

        System.out.printf("Dados atualizados: %s, $ %.2f, %d unidades, Total: $ %.2f%n", produto.nome,produto.preco,produto.quantidade,produto.valorTotalEmEstoque());

        System.out.print("Insira o numero de produtos que serao removidos do estoque:");
        valor = sc.nextInt();
        produto.removerProduto(valor);

        System.out.println(produto.toString());

        sc.close();
    }
}
