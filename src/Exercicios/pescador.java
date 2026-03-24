package Exercicios;

import java.util.Scanner;

public class pescador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso dos peixes (kg): ");
        float peso = sc.nextFloat();

        float limite = 50;
        float excesso = 0;
        float multa = 0;

        if (peso > limite) {
            excesso = peso - limite;
            multa = excesso * 4;
        } else {
            excesso = 0;
            multa = 0;
        }

        System.out.println("Excesso: " + excesso + " kg");
        System.out.println("Multa: R$ " + multa);

        sc.close();
    }
}
