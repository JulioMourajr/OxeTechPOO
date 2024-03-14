package Aula3;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        int [] arrayDeInteiros = new int[5];
        int negativos = 0;
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número inteiro: ");
            arrayDeInteiros[i] = leitor.nextInt();
        }

        for (int numero : arrayDeInteiros){
            if(numero < 0){
                negativos++;
            }
        }
        System.out.println("Você digitou " +negativos + " numero(s) negativo(s)!");

    }
}
