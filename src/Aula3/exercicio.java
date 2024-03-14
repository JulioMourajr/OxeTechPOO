package Aula3;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*double numero;
        int contador=0;
        System.out.println("Digite um valor: ");
        numero = leitor.nextDouble();
        while(numero != -1){
            System.out.println("Digite um valor: ");
            numero = leitor.nextDouble();
            contador++;
        }*/
        int numero1;
       double soma=0;
       int media = 0;
       int i;
        for ( i=0; i < 5; i++){
            System.out.println("Digite um valor: ");
            numero1 = leitor.nextInt();
            soma +=numero1;
        }

        System.out.println(soma/5);


    }
}
