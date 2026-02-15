package Exercicios;

import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o reio do circulo ");
        int raio = scan.nextInt();
        double calcularArea = 3.14 *(raio *2);
        System.out.println("O resultado e : " +calcularArea);
    }
}
