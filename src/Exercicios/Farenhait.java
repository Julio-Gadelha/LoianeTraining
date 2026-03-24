package Exercicios;

import java.util.Scanner;

public class Farenhait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o número real: ");
        double num3 = sc.nextDouble();


        double a = (num1 * 2) * (num2 / 2.0);
        double b = (num1 * 3) + num3;
        double c = Math.pow(num3, 3);


        System.out.println("a) Resultado: " + a);
        System.out.println("b) Resultado: " + b);
        System.out.println("c) Resultado: " + c);

        sc.close();

    }
}
