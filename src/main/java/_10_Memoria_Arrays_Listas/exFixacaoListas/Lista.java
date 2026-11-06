package _10_Memoria_Arrays_Listas.exFixacaoListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Lista {
    /**
     * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario)
     * de N funcionários. Não deve haver repetição de id.
     *
     * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
     * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
     * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
     * conforme exemplos.
     *
     * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
     * ser mudado livremente. Um salário só pode ser aumentado com base em uma operacão de
     * aumento por porcentagem dada.
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int quantity = sc.nextInt();
        System.out.println(" ");

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Employee #%d:%n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();

            while (hasId(funcionarios, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println(" ");

            funcionarios.add(new Funcionario(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Funcionario funcionario = funcionarios.stream().filter(funcionario1 -> funcionario1.getId() == id).findFirst().orElse(null);

        if (funcionario == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            funcionario.increaseSalary(percentage);
        }

        System.out.println(" ");
        System.out.println("List of employees:");
        for (Funcionario e : funcionarios) {
            System.out.println(e);
        }


        sc.close();
    }

    /**
     * OS MÉTODOS CRIADOS APÓS A CORRECÃO DO AULÃO, NÃO CONSEGUI FAZER SOZINHO
     */

    public static Integer position(List<Funcionario> list, int id) {
        for (int i = 0; i< list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
