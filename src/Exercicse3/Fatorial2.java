package Exercicse3;

import java.util.Scanner;

public class Fatorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite um número (0 a 15): ");
            n = sc.nextInt();

            if (n >= 0 && n < 16) {
                int fatorial = 1;

                for (int i = 1; i <= n; i++) {
                    fatorial *= i;
                }

                System.out.println("Fatorial: " + fatorial);
            } else {
                System.out.println("Número inválido!");
            }

            System.out.print("Deseja continuar? (1-Sim / 0-Não): ");
        } while (sc.nextInt() == 1);

        sc.close();
    }
}
