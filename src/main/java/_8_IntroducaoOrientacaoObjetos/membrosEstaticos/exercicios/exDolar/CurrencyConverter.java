package _8_IntroducaoOrientacaoObjetos.membrosEstaticos.exercicios.exDolar;

public class CurrencyConverter {
    public static double tax = 0.06;

    public static double totalDolars (double dollarValue, double dollarAmount){
        double total = dollarValue * dollarAmount;
        return total + (total * tax);
    }
}