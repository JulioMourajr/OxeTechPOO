package Aula2;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*System.out.println("Qual é o seu nome? ");
        String nome = leitor.nextLine();
        System.out.println("Olá, " + nome + "!");*/

        //double numero1, numero2, soma, produto, diferenca, media, razao, resto;
        double nota1, nota2, nota3, soma, media;
        int numero;
        /*System.out.println("Digite um número: ");
        numero1 = leitor.nextDouble();
        System.out.println("Digite outro número: ");
        numero2 = leitor.nextDouble();
        soma = numero1+numero2;
        produto = numero1*numero2;
        diferenca = numero1 - numero2;
        media = (numero1+numero2)/2;
        razao = numero1/numero2;
        resto = numero1%numero2;
        System.out.println("A soma é " + soma + " O produto é " + produto + " A diferença é " + diferenca);
        System.out.println("A media é " + media + " A razao é " + razao + "O resto é " + resto);*/

        System.out.println("Digite outro numero: ");
        numero = leitor.nextInt();
        if (numero%2==0){
            System.out.println("O número " + numero + " é par!");
        }else{
            System.out.println("O número " + numero + " é impar!");
        }

        double nota;
        double soma1=0;
        for (int i = 1; i <4; i++){
            System.out.println("Digite a " + i + "º nota: ");
            nota = leitor.nextDouble();;
            soma1+=nota;
        }
        /*System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.println("A segunda nota: ");
        nota2 = leitor.nextDouble();
        System.out.println("A terceira nota");
        nota3 = leitor.nextDouble();
        soma = nota1+nota2+nota3;
        */

        media=soma1/3;

        if (media>7){
            System.out.println("A media é maior do que 7! \n " + media);
        } else if (media==7) {
            System.out.println("A media é igual a 7! \n " + Math.floor(media));
        }else {
            System.out.println("A media é menor do que 7! \n "  + Math.floor(media));
        }

    }
}
