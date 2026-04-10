package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite valor para A: ");
            A[i] = sc.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite valor para B: ");
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            C[i] = A[i];
        }


        for (int i = 0; i < 10; i++) {
            C[i + 10] = B[i];
        }


        System.out.println("Vetor C:");
        for (int i = 0; i < 20; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
