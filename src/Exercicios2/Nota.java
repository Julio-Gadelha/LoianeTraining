package Exercicios2;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua primeira nota de VP ");
        int nota = scan.nextInt();
        System.out.println("Digite sua segunda nota de VP");
        int nota2 = scan.nextInt();
        int media = (nota + nota2) / 2;

        if(media >7){
            System.out.println("Ta aprovado");
        } else {
            System.out.println("Ta reprovado");
        }
    }
}
