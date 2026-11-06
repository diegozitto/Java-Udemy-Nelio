package _8_IntroducaoOrientacaoObjetos.desafios.OOO4;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Nota primeiro trimestre: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota segundo trimestre: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota terceiro trimestre: ");
        aluno.nota3 = sc.nextDouble();

        aluno.pontosFaltantes();

        sc.close();
    }
}
