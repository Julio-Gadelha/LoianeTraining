package Arrays.Exercicios4;

import java.util.Scanner;

public class vetor25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();


            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
        }

        System.out.println("\nVetor B:");

        for (int i = 0; i < 10; i++) {
            System.out.println(B[i]);
        }

        sc.close();
    }
}
