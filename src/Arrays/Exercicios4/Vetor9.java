package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        float[] C = new float[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor de A[" + i + "]: ");
            A[i] = sc.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor de B[" + i + "]: ");
            B[i] = sc.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            if (B[i] != 0) {
                C[i] = (float) A[i] / B[i];
            } else {
                System.out.println("Não pode dividir por zero em B[" + i + "]");
                C[i] = 0;
            }
        }


        System.out.println("\nResultado do vetor C:");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

        sc.close();
    }

}
