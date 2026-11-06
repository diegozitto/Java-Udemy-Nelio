package _9_Construtores_This_Sobrecarga_Encapsulamento.exFixacao;

public class Conta {
    private String titular;
    private final int numeroDaConta;
    private double saldo;
    private final int taxaDeSaque = 5;

    public Conta (String titular,int numeroDaConta){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
    }

    public Conta (String titular,int numeroDaConta, double saldoInicial){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        deposito(saldoInicial);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valorDeDeposito){
        saldo += valorDeDeposito;
        System.out.printf("Titular: %s%n Número da conta: %d%n Saldo: R$ %.2f%n",
                getTitular(),getNumeroDaConta(),getSaldo());
    }

    public void saque(double valorDeSaque){
            saldo -= valorDeSaque + taxaDeSaque;
            System.out.printf("Titular: %s%n Número da conta: %d%n Saldo: R$ %.2f%n",
                    getTitular(),getNumeroDaConta(),getSaldo());

    }

    public String toString(){
        return   "Dados da conta"
                +"\n-------------------------------"
                +"\nTitular: " + getTitular()
                +"\nNúmero da conta: " + getNumeroDaConta()
                +"\nSaldo: R$ " + String.format("%.2f", saldo)
                +"\n-------------------------------";
    }
}
