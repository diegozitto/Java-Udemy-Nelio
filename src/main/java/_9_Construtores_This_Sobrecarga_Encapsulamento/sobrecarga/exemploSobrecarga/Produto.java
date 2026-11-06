package _9_Construtores_This_Sobrecarga_Encapsulamento.sobrecarga.exemploSobrecarga;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double valorTotalEmEstoque(){
        double total = preco * quantidade;
        return total;
    }

    public void addProduto (int valor){
        quantidade = quantidade + valor;
    }

    public void removerProduto (int valor){
        quantidade = this.quantidade - valor;
    }

    public String toString() {
        return  nome
                + ", $"
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: $ "
                + String.format("%.2f", valorTotalEmEstoque());
    }
}
