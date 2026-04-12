package Arrays.Multidimensionais.Exercise5;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int[][] M = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número: ");
                M[i][j] = sc.nextInt();

                if (M[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
}
