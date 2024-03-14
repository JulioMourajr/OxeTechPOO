package Aula6.Escola;

public class Aluno extends Pessoa{
    int matricula;

    public Aluno(String nome, String cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String toString() {
        return "Aluno" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                "Matricula:" + this.matricula ;
    }
}
