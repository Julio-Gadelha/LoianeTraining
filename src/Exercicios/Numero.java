package Exercicios;


import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um numero !");
        int numero = scan.nextInt();
        scan.close();
        System.out.println("O numero que foi informado e : "+numero);
    }
}
