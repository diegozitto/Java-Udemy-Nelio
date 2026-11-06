package _8_IntroducaoOrientacaoObjetos.desafios.OOO1;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

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
