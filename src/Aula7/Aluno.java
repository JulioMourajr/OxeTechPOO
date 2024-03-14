package Aula7;

public class Aluno extends Pessoa{
    @Override
    public String descricao() {
        return "O aluno " + this.getNome();
    }

    public Aluno(String nome) {
        super(nome);
    }

}
