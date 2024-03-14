package Aula2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Aula2Ex {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1, numero2;
        String sexo;


        double nota1, nota2, soma, media;
        double salario = 0;
        double  salarioReajustado = 0;
        double percentual;

        double []produtos = new double[3];

        System.out.println("Qual é o seu sexo? ");
        sexo = leitor.nextLine();
        sexo = sexo.toLowerCase(Locale.ROOT);
        if (sexo.startsWith("m")){
            System.out.println("Sexo Masculino!");
        }else if(sexo.startsWith("f")){
            System.out.println("Sexo Feminino!");
        }else{
            System.out.println("Sexo invalido!");
        }

        /*1 - System.out.println("Diga um número: ");
        numero1 = leitor.nextInt();
        System.out.println("Diga outro número: ");
        numero2 = leitor.nextInt();
        if (numero1 > numero2){
            System.out.println("O número " + numero1 + " é maior!");
        }else{
            System.out.println("O numero " + numero2 + " é maior!");
        }
        2)
        if(numero1 >0){
            System.out.println("Ele é positivo!");
        } else if (numero1 == 0) {
            System.out.println("O número é igual a 0!");
        }else{
            System.out.println("É NEGATIVO!");
        }*/

        /* 4 - System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.println("Digite outra nota: ");
        nota2 = leitor.nextDouble();
        soma = nota1 + nota2;
        media = soma / 2;
        if (media==10){
            System.out.println("Aprovado com distinção!");
        }
        else if (media >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }*/

        /* 5 - for (int i = 0; i < 3; i++) {
            System.out.println("Qual é o preço do produto");
            produtos[i] = leitor.nextDouble();
        }

        String result = String.valueOf(Arrays.stream(produtos).min());
        String menor = result.substring(15,16);
        System.out.println("O menor preço é o " + menor);*/

        System.out.println("Digite o Salário do funcionário: ");
        salario = leitor.nextDouble();

        if(salario > 1500){
            percentual = 0.05;
            salarioReajustado = salario + (salario*percentual);
        } else if (salario > 700 && salario <= 1500) {
            percentual = 0.10;
            salarioReajustado = salario + (salario*percentual);
        } else if (salario > 280 && salario < 700) {
            percentual = 0.15;
            salarioReajustado = salario + (salario*percentual);
        }else {
            percentual = 0.20;
            salarioReajustado = salario + (salario*percentual);
        }
        System.out.println("O salario antes do reajuste é " + salario + " R$");
        System.out.println("O percentual aplicado foi " + (percentual*100) + " %!");
        System.out.println("O salario reajustado é " + salarioReajustado + " R$");
        System.out.println("O valor aumentado foi de " + (salarioReajustado - salario) + " R$");
    }
}
