package Aula7.Atividade2;

class Carne extends Item {
    public double calcularDesconto(double peso) {
        return peso > 1.0 ? 0.08 : 0.0;
    }

    public Carne(String produto, Double precoPorKg) {
        super(produto, precoPorKg);
    }
}
