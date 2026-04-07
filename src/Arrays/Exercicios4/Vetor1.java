package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número para A[" + i + "]: ");
            A[i] = sc.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            B[i] = A[i];
        }


        System.out.println("\nVetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }

        sc.close();
    }
}
