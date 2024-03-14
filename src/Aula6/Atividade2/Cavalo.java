package Aula6.Atividade2;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom(String som) {
        System.out.println(this.nome + " fez " + som);
    }

    public void acao(String acao){
        System.out.println(this.nome + acao);
    }
}
