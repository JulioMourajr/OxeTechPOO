package Aula8.Empresa;

public abstract class Pessoa {
    String nome;
    String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
}
