package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int [] A = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Escreva os elementos inteiros : ");
            A[i] = sc.nextInt();
        }

        for (int num : A) {
            soma += num;
        }

        System.out.println("O resultado são : " + soma);
    }

}
