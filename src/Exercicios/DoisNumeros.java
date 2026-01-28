package Exercicios;

import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo numero inteiro");
        int numero2 = scan.nextInt();
        int soma = numero1 + numero2;
        scan.close();
        System.out.println("Resultado " + soma);
    }
}
