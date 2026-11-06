package _8_IntroducaoOrientacaoObjetos.membrosEstaticos.circunferencia.modo2.util;

public class Calculator {

    public double PI = 3.14159;

    public double circunferencia ( double raio){
        return 2.0 * PI * raio;
    }

    public double volume ( double raio){
        return 4.0 * PI * raio * raio * raio / 3;
    }
}
