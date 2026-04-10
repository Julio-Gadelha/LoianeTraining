package Arrays.Exercicios4;

import java.util.Scanner;

public class vetor28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            B[i] = A[9 - i];
        }

        System.out.println("Vetor B invertido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
