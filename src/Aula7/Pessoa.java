package Aula7;

public abstract class Pessoa {
    private String nome;
    public abstract String descricao(); // metodo abstrato

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() { // metodo concreto
        return nome;
    }
}
