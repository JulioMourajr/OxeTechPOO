package Aula6;

import Aula6.Escola.Aluno;
import Aula6.Escola.Pessoa;

public class Polimorfismo {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Julio", "101010");

        System.out.println(p1);

        Aluno aluno = new Aluno("PEdro", "102020", 4545);
        System.out.println(aluno);
    }

}
