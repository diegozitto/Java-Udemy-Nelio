package _9_Construtores_This_Sobrecarga_Encapsulamento.encapsulamento.exemploEncapsulamento;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
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
