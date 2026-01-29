package Exercicios2;

import java.util.Scanner;

public class PositivoOrNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        int numero = scan.nextInt();
        scan.close();

        if( numero > 0){
            System.out.println("Numero positivo");
        } else{
            System.out.println("Numero negativo");
        }
    }
}
