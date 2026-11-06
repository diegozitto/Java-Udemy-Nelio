package _10_Memoria_Arrays_Listas.exemplos;

public class LacoForEach {
    /**
     * for (Tipo apelido:colecao){
     * <comando 1>
     * <comando 2>
     * }
     */
    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        for (String obj : vect) {
            System.out.println(obj);
        }


    }
}
