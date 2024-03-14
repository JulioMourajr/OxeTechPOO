package Aula1;

import java.util.Scanner;

public class aula1EX {
    public static void main(String[] args) {
        /*System.out.println("Alo Mundo!");
Scanner sc = new Scanner(System.in);
System.out.println("Informe um numero inteiro.");
int numero = sc.nextInt();
System.out.println("O numero informado foi: " + numero);

Scanner sc = new Scanner(System.in);
System.out.println("Informe um numero inteiro: ");
int numero1 = sc.nextInt();
System.out.println("Informe outro numero inteiro: ");
int numero2 = sc.nextInt();
int soma = numero1 + numero2;
System.out.println("O resultado da soma é: " + soma);
int soma = 0;
int media = 0;
Scanner sc = new Scanner(System.in);
for (int i = 1; i <= 4; i++) {
    System.out.println("Informe a  " + i +"º nota: ");
    double numero1 = sc.nextDouble();
    soma += numero1;
}
media = soma / 4;
System.out.println("O resultado da media é: " + media);

Scanner sc = new Scanner(System.in);
double medidaMetro;
double medidaCentimetro;
System.out.println("Informe a medida em metros: ");
medidaMetro = sc.nextDouble();
medidaCentimetro = medidaMetro * 100;
System.out.println("A medida em centimetros é: " + medidaCentimetro + "cm");

Scanner sc = new Scanner(System.in);
double pi = 3.14159;
double area;
System.out.println("Qual é o raio do circulo? ");
double raio = sc.nextDouble();
area = pi * raio * raio;
System.out.println("A area do circulo é: " + area);

Scanner sc = new Scanner(System.in);
System.out.println("Qual é o lado do quadrado? ");
double lado = sc.nextDouble();
double area = lado * lado;
double dobroArea = area * 2;
System.out.println("A area do quadrado é: " + area);
System.out.println("O dobro da area do quadrado é: " + dobroArea);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos saber qual é o seu salario!");
        System.out.println("Me diga quanto você ganha por hora: ");
        double salarioPorHora = sc.nextDouble();
        System.out.println("Quantas horas voce trabalhou mes passado? ");
        double horasTrabalhadas = sc.nextDouble();
        double salarioBruto = salarioPorHora * horasTrabalhadas;
        System.out.println("Seu salario é: " + salarioBruto + "R$");
    }
}
