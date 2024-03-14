package Aula4;

public class Pessoa {
    String nome;
    int idade;
    double altura;

   /*Pessoa(String nome, int idade, double altura){
       this.nome = nome;


   }*/

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    void falar(String texto){
        System.out.println(texto);
    }

    void andar(int passos){
        System.out.println("Andou " +passos+ " passos!");
    }
}
