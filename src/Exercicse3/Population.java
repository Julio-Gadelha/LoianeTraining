package Exercicse3;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char continuar;

        do {
            double popA, popB;
            double taxaA, taxaB;
            int anos = 0;

            // População A
            do {
                System.out.print("Digite a população de A: ");
                popA = sc.nextDouble();
                if (popA <= 0) {
                    System.out.println("Valor inválido!");
                }
            } while (popA <= 0);

            // População B
            do {
                System.out.print("Digite a população de B: ");
                popB = sc.nextDouble();
                if (popB <= 0) {
                    System.out.println("Valor inválido!");
                }
            } while (popB <= 0);

            // Taxa A
            do {
                System.out.print("Digite a taxa de crescimento de A (%): ");
                taxaA = sc.nextDouble();
                if (taxaA <= 0) {
                    System.out.println("Valor inválido!");
                }
            } while (taxaA <= 0);

            // Taxa B
            do {
                System.out.print("Digite a taxa de crescimento de B (%): ");
                taxaB = sc.nextDouble();
                if (taxaB <= 0) {
                    System.out.println("Valor inválido!");
                }
            } while (taxaB <= 0);

            // Cálculo
            while (popA < popB) {
                popA += popA * (taxaA / 100);
                popB += popB * (taxaB / 100);
                anos++;
            }

            System.out.println("Anos necessários: " + anos);

            // Repetir programa
            System.out.print("Deseja repetir? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa encerrado.");
    }
}

