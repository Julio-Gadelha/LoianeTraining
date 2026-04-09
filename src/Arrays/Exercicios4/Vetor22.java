package Arrays.Exercicios4;

import java.util.Random;
import java.util.Scanner;

public class Vetor22 {
    public static void main(String[] args) {
        int[] A = new int[10];
        Random random = new Random();

        int cont0 = 0;
        int cont1 = 0;


        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(2);

            System.out.print(A[i] + " ");


            if (A[i] == 0) {
                cont0++;
            } else {
                cont1++;
            }
        }


        double perc0 = (cont0 / 10.0) * 100;
        double perc1 = (cont1 / 10.0) * 100;

        System.out.println("\n\nQuantidade de 0: " + cont0);
        System.out.println("Quantidade de 1: " + cont1);

        System.out.println("Percentual de 0: " + perc0 + "%");
        System.out.println("Percentual de 1: " + perc1 + "%");
    }
}
