package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int [] C = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os numeros A  : ");
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite seus numeros  B : ");
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 10  ; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println("os resultados de C é : ");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(C[i]);
        }
        sc.close();

    }
}
