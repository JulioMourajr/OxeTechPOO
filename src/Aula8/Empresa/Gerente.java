package Aula8.Empresa;

public class Gerente extends Funcionario{
    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }


    public void calcularSalario(double salario, int vendasTotais) {
        this.salario = salario + (65*vendasTotais);
    }

}
