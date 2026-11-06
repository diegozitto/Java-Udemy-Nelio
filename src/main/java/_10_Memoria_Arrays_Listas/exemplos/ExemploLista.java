package _10_Memoria_Arrays_Listas.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploLista {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x + " - " + list.indexOf(x));
        }
        System.out.println("------------------------------------------");
        /**
         * Remover toda String 'x' tal que o primeiro caractere de 'x' comece com 'M'
         * [x -> x.charAt(0) == 'M'] --> funcão lambda do tipo predicado pois retorna V/F
         */
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x + " - " + list.indexOf(x));
        }

        System.out.println("------------------------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        /**
         * Quando não encontra o elemento, retorna -1
         */
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("------------------------------------------");

        /**
         * Para filtrar todos os elementos que comecem com 'A' é necessário
         * criar uma segunda lista do mesmo tipo e utilizar o comando 'stream'
         * que é um tipo especial do Java que aceita funcões lambdas
         * ---------------------------------------------------------------------------
         * 'collect(Collectors.toList())' pode ser substituído pelo 'toList()' direto
         */
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x + " - " + result.indexOf(x));
        }

        System.out.println("------------------------------------------");

        /**
         * Vai procuran o primeiro elemento que comece com 'A', se não achar, retorna null
         */
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


    }
}
