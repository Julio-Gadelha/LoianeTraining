package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite seus numeros A  : ");
            A[i] = sc.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            B[i] = A[i] * i;
        }


        System.out.println("Os resultados são:");
        for (int i = 0; i < 10; i++) {
            System.out.println(B[i]);
        }

        sc.close();
    }
}
