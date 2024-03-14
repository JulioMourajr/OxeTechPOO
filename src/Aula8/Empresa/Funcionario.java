package Aula8.Empresa;

public abstract class Funcionario extends Pessoa{
    double salario;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);

    }

    public abstract void calcularSalario(double Salario, int vendasTotais);
}
