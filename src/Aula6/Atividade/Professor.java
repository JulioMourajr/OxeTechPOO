package Aula6.Atividade;

import Aula6.Atividade.Pessoa;

public class Professor extends Funcionário {
    String Materias;


    public Professor(String nome, int idade, String cpf, String departamento,
                     double salario, String materias) {
        super(nome, idade, cpf, departamento, salario);
        Materias = materias;
    }

    public String EnsinarMateria(String Materias){
       return this.Materias = Materias;
    }
}
