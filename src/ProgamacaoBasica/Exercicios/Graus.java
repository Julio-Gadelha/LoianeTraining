package ProgamacaoBasica.Exercicios;

import java.util.Scanner;

public class Graus {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os graus em Farenhait : ");
        int faren = scan.nextInt();
        scan.close();

         int celsius = (  5 * faren) /9;
        System.out.println(" O resultado em graus e :  " + celsius);
    }
}
