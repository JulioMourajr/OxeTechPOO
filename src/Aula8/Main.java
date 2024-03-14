package Aula8;

public class Main {
    public static void main(String[] args) {
        String frase =  "Julio Moura";
        String fraseNOva = null;

        try {
            frase.toUpperCase();
        }catch (NullPointerException erro){
            System.out.println("Erro " + erro.toString());
            System.out.println("Frase está nula.");
            frase = "Frase padrão";
        }finally {
            fraseNOva = frase.toUpperCase();
            System.out.println("Frase antiga " + frase);
            System.out.println("Frase nova " + fraseNOva);
        }
    }
}
