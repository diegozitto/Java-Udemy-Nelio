package _10_Memoria_Arrays_Listas.desafioVetoresPensionato;

public class Estudante {
    private String nome;
    private String email;

    public Estudante(String nome, String email){
        this.nome = nome;
        this.email= email;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome + ", " + email;
    }
}
