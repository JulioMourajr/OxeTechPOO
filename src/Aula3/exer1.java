package Aula3;

public class exer1 {
    public static void main(String[] args) {
        int [] arrayDeInteiros = new int[10];

        //segunda sequencia

    /*
    int [] arrayDeInteiros = new int[11];
    for (int i = 0; i < 11; i++){
        arrayDeInteiros[i] = i*i;
    }
    for (int inteiro:
         arrayDeInteiros) {
        System.out.println(inteiro);
    }*/


    /*
    // Primeira sequencia

    int j = 0;
    for (int i = 10; i > 0; i--){
        arrayDeInteiros[j] = i;
        j++;
    }

    for (int inteiro:
            arrayDeInteiros) {
        System.out.println(inteiro);
    }


     */


        // terceira
        int j = 10;
        for (int i = 0 ; i < 10; i++){
            if (i == 5) {
                arrayDeInteiros[i] = i  * 2;
            } else if (i > 5) {
                arrayDeInteiros[i] = (j * (i-4)) ;
            } else {
                arrayDeInteiros[i] = i + 1;
            }
        }

        for (int inteiro:
                arrayDeInteiros) {
            System.out.println(inteiro);
        }
    }
}

