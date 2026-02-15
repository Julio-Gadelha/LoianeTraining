package Exercicios;

import java.util.Scanner;

public class Metro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        int numero = scan.nextInt();
        int converte = numero * 100;
        System.out.println("Equivale em centimentros :" + converte + "Cm");
        scan.close();
    }
}
