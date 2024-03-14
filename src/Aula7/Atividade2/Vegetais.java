package Aula7.Atividade2;

public class Vegetais extends Item {
    public Vegetais(String produto, Double precoPorKg) {
        super(produto, precoPorKg);
    }

    public double calcularDesconto(double peso) {
        return peso > 1.0 ? 0.08 : 0.0;
    }
}
