package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] A = new int[10];
        int soma = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Escreva os elementos inteiros : ");
            A[i] = sc.nextInt();
        }

        for (int num : A) {
            soma += num;
        }

        int resultado = soma  /10;

        System.out.println("O resultado da media aritimedica : " + resultado);

    }
}
