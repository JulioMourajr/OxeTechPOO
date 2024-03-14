package Aula7.Atividade2;


public class Main {

    public static void main(String[] args) {
        Fruta maca = new Fruta("Maçã", 5.0);
        double preco = maca.calcularPrecoFinal(3.0);
        System.out.println("O preço final da " + maca.produto + " é " + preco);
    }
}
