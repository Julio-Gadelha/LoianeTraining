package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];

        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade: ");
            A[i] = sc.nextInt();

            if (A[i] > 35) {
                contador++;
            }
        }

        System.out.println("Quantidade de pessoas com idade > 35: " + contador);

        sc.close();

    }
}
