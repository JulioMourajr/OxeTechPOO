package Aula4;

public class Conta {
    String titular;
    String cpf;
    private double saldo;

    Conta(String titular, String cpf){
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double deposito){
        this.saldo += deposito;
    }
}
