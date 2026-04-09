package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        char[] B = new char[10];


        for (int i = 0; i < 10; i++) {

            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();

            if (A[i] < 7) {
                B[i] = 'a';
            }
            else if (A[i] == 7) {
                B[i] = 'b';
            }
            else if (A[i] > 7 && A[i] < 10) {
                B[i] = 'c';
            }
            else if (A[i] == 10) {
                B[i] = 'd';
            }
            else {
                B[i] = 'e';
            }
        }

        System.out.println("\nVetor B:");

        for (int i = 0; i < 10; i++) {
            System.out.println(B[i]);
        }

        sc.close();
    }
}
