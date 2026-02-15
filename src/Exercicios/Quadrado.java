package Exercicios;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o lado o valor do dado do quadrado : ");
        int lado = scan.nextInt();
        int resultado = lado * lado;
        System.out.println("O resultado e : " + resultado);
    }
}
