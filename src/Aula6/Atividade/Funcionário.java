package Aula6.Atividade;

public class Funcionário extends Pessoa {
    String Departamento;

    double Salario;

    public Funcionário(String nome, int idade, String cpf, String departamento, double salario) {
        super(nome, idade, cpf);
        Departamento = departamento;
        Salario = salario;
    }

    public String getDepartamento(String Departamento){
        return this.Departamento = Departamento;
    }

    public double getRendaAtual(double Salario){

        return this.Salario = Salario * 12;
    }
}
