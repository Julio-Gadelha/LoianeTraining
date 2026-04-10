package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[20];
        int[] B = new int[20];

        int pos = 0;


        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[pos] = A[i];
                pos++;
            }
        }


        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 != 0) {
                B[pos] = A[i];
                pos++;
            }
        }


        System.out.println("Vetor B:");
        for (int i = 0; i < 20; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
