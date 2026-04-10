package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[20];
        int[] B = new int[20];
        int[] C = new int[20];
        int posB = 0;
        int posC = 0;


        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }


        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[posB] = A[i];
                posB++;
            } else {
                C[posC] = A[i];
                posC++;
            }
        }

        System.out.println("Pares:");
        for (int i = 0; i < posB; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println();


        System.out.println("Ímpares:");
        for (int i = 0; i < posC; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
