package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[15];
        double[] B = new double[15];


        for (int i = 0; i < 15; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }


        for (int i = 0; i < 15; i++) {
            B[i] = Math.sqrt(A[i]);
        }

        System.out.println("\nRaiz quadrada dos valores:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Raiz de " + A[i] + " = " + B[i]);
        }

        sc.close();
    }
}
