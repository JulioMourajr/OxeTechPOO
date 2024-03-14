package Aula7.Atividade2;

public class Fruta extends Item {
    public double calcularDesconto(double peso) {
        return peso > 2.0 ? 0.1 : 0.0;
    }

    public Fruta(String produto, Double precoPorKg) {
        super(produto, precoPorKg);
    }
}
