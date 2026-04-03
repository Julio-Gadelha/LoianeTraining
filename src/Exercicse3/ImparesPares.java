package Exercicse3;

import java.util.Scanner;

public class ImparesPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, pares = 0, impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        sc.close();
    }
}
