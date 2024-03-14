package Aula6.Atividade2;

public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void emitirSom(){
        System.out.println("O animal fez um som!");
    }

    public void acao(){
        System.out.println("O animal fez uma ação.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
