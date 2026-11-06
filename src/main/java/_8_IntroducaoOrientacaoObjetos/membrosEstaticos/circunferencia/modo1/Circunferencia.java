package _8_IntroducaoOrientacaoObjetos.membrosEstaticos.circunferencia.modo1;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {

    /**
     * Para definir como constante: adicione a palavra FINAL após static, assim ele não pode ser alterado
     * A regra é que constantes tem sempre nomes maiúsculos, se forem duas palavras usa-se "_" ( NET_SALARY )
     */
    public static double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira valor de raio:");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.printf("Circunferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n",PI);



        sc.close();
    }

    public static double circunferencia ( double raio){
        return 2.0 * PI * raio;
    }

    public static double volume ( double raio){
        return 4.0 * PI * raio * raio * raio / 3;
    }
}
