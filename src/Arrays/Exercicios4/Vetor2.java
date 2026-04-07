package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[8];
        int[] B = new int[8];


        for (int i = 0; i <8 ; i++) {
            System.out.print("Digite um número para A : \n " );
            A[i] = sc.nextInt();
        }

        for (int i = 0; i <8 ; i++) {
            B[i] = A[i];
        }

        for (int i = 0; i < 8; i++) {
         int Resultado = A[i] * 2;
            System.out.println("Resultado e : " + Resultado);
        }
        sc.close();
    }
}
