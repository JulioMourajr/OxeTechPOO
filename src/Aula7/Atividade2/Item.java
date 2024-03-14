package Aula7.Atividade2;

public abstract class Item {
    String produto;
    Double precoPorKg;

    public abstract double calcularDesconto(double var1);

    public Item(String produto, Double precoPorKg) {
        this.produto = produto;
        this.precoPorKg = precoPorKg;
    }

    public double calcularPrecoFinal(double peso) {
        double valorDoDesconto = this.calcularDesconto(peso);
        double precoFinal = this.precoPorKg * peso * (1.0 - valorDoDesconto);
        return precoFinal;
    }
}
