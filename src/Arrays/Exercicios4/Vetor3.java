package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[15];
        int[] B = new int[15];


        for (int i = 0; i < 15; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }


        for (int i = 0; i < 15; i++) {
            B[i] = A[i];
        }


        System.out.println("Os resultados foram:");
        for (int i = 0; i < 15; i++) {
            int resultado = B[i] * B[i];
            System.out.println(resultado);
        }

        sc.close();
    }
}
