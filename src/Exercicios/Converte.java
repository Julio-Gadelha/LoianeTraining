package Exercicios;

import java.util.Scanner;

public class Converte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os graus em Farenheit");
        int f = scan.nextInt();
        int grausC =  5* (f  - 32) /9;
        scan.close();
        System.out.println("O grau celsiu e : "+ grausC);
    }
}
