package Exercicios2;

import java.util.Scanner;

public class Alfabeto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra do alfabeto");
        char letra = scan.next().toLowerCase().charAt(0);



        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("É uma vogal");
                break;
            default:
                System.out.println("É uma consoante");
        }

        scan.close();
    }
}
