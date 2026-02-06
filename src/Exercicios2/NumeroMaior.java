package Exercicios2;

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero :");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo numero :");
        int numero2 = scan.nextInt();
        System.out.println("Digite o terceiro numero :");
        int numero3 = scan.nextInt();
        scan.close();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O numero1 e maior : " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O numero2 e maior : " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O numero3 e maior : " + numero3);
        }


    }
}
