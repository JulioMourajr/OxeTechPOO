package Aula4;

public class Aluno {
    String nome;
    String Matricula;
    String CPF;
    String Email;

    public Aluno(String nome, String matricula, String CPF, String email) {
        this.nome = nome;
        Matricula = matricula;
        this.CPF = CPF;
        Email = email;
    }

    void estudar(String materia, double nota){
        System.out.println(this.nome + " está estudando " + materia + " e a nota sua nota foi " + nota + " !");
    }

    void darNota(double nota){
        if(nota >= 7){
            System.out.println(this.nome + " está Aprovado!");
        }else{
            System.out.println(this.nome + " está Reprovado!");
        }
    }
}
