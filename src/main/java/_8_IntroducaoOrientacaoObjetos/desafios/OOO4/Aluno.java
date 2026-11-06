package _8_IntroducaoOrientacaoObjetos.desafios.OOO4;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
       return nota1 + nota2 + nota3;
    }

    public void pontosFaltantes(){
        if (notaFinal() < 60.0) {
            System.out.printf("NOTA FINAL = %.2f%n", notaFinal());
            System.out.printf("FALTANDO %.2f PONTOS%n", notaFinal()-60.00);
            System.out.printf("FALHOU%n");
        } else {;
            System.out.printf("NOTA FINAL = %.2f%n", notaFinal());
            System.out.print("PASSOU");
        }
    }




 }

