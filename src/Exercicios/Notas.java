package Exercicios;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as sua primeira nota : ");
        int nota = scan.nextInt();
        System.out.println("Digite sua segunda nota :");
        int nota2 = scan.nextInt();
        System.out.println("Digite sua terceira nota : ");
        int nota3 = scan.nextInt();
        System.out.println("Digite sua quarta nota : ");
        int nota4 = scan.nextInt();
        int media = (nota + nota2 + nota3 + nota4 ) /4;
        scan.close();
        System.out.println("Media das suas notas "+media);
    }
}
