package _8_IntroducaoOrientacaoObjetos.membrosEstaticos.circunferencia.modo3.util;

public class Calculator {

    public static double PI = 3.14159;

    public static double circunferencia ( double raio){
        return 2.0 * PI * raio;
    }

    public static double volume ( double raio){
        return 4.0 * PI * raio * raio * raio / 3;
    }
}
