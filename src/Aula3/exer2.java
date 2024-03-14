package Aula3;

public class exer2 {
    public static void main(String[] args) {
        int [] arrayDeInteiros = new int[11];
        /*for (int i = 0; i < 11; i++){
            arrayDeInteiros[i] = i*i;
        }
        for (int inteiro:
             arrayDeInteiros) {
            System.out.println(inteiro);
        }*/

        /*for (int i = 0; i < 10; i++){
            arrayDeInteiros[i] = i;
        }*/

        for (int i = 10; i > 0; i--){
            arrayDeInteiros[i] = i;
        }

        for (int inteiro:
                arrayDeInteiros) {
            System.out.println(inteiro);
        }
    }
}
