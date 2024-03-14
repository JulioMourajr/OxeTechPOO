package Aula6.Atividade2;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom(String som) {
        System.out.println(this.nome + som);
    }

    public void acao(String acao){
        System.out.println(this.nome + " fez " + acao);
    }


}
