package Exercicios2;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua nota");
        float nota = scan.nextFloat();
        scan.close();

        if (nota > 9 && nota < 10) {
            System.out.println("A : Aprovado");
        } else if (nota > 7.5 && nota < 9) {
            System.out.println("B : Aprovado ");
        } else if (nota > 6 && nota < 7.5) {
            System.out.println("C : Aprovado ");
        } else if (nota > 4 && nota < 6) {
            System.out.println("D : Reprovado");
        } else if(nota <4){
            System.out.println("E : Reprovado");
        }

    }
}
