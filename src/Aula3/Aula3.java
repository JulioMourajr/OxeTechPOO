package Aula3;

public class Aula3 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10){
            System.out.println(contador);
            contador++;
        }

        do {
            System.out.println("Repeticao nr " + contador);
            contador--;
        }while (contador > 0);

        System.out.println("COm for!");
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
    }
}
