package Exercicios2;

import java.util.Scanner;

public class SegundoGrau{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();


        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            System.out.print("Digite o valor de B: ");
            double b = sc.nextDouble();

            System.out.print("Digite o valor de C: ");
            double c = sc.nextDouble();

            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("A equação possui uma raiz: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("A equação possui duas raízes:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        sc.close();
    }
}

