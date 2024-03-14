package Aula3;


import java.util.Scanner;

public class AulaArrays {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       int [] arrayDeInteiros = new int[5];
       double[] arrayDouble = new double[3];
       for (int i = 0; i <5; i++){
           arrayDeInteiros[i] = i * 2;
       }

        for (int i = 0; i <5; i++){
            System.out.println("Indice: " +i+ " valor: " + arrayDeInteiros[i]);
        }

        for(int i = 0; i < arrayDouble.length; i++){
            System.out.println("Número " + i);
        }
    }
}
