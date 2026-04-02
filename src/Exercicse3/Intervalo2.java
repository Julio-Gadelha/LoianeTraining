package Exercicse3;

import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, soma = 0;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        int inicio = Math.min(n1, n2);
        int fim = Math.max(n1, n2);

        System.out.println("Números no intervalo:");

        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("\nSoma dos números: " + soma);

        sc.close();
    }
}

