package Aula6.Atividade;

public class Aluno extends Pessoa {

    double notas;

    public Aluno(String nome, int idade, String cpf, double notas) {
        super(nome, idade, cpf);
        this.notas = notas;
    }

    public void verificarMedia(){

        if(notas >= 7){
            System.out.println("O " + this.nome + "passou!");
        }else{
            System.out.println("O " + this.nome + "não passou!");
        }
    }
}
