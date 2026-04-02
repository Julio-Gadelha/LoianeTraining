package Exercicse3;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            soma = soma + numero;
        }

        int media = soma / 5;

        System.out.println("A média dos números é: " + media);

        sc.close();
    }
}




