package Exercicios2;

import java.util.Scanner;

public class Frutaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos kilos de frutas escolheu");
        int kilo = scan.nextInt();

        System.out.println("Qual fruta ira escolher [1] = maça [2] = morango : ");
        int type = scan.nextInt();
        scan.close();

        if( kilo <= 5 && type == 1 || type ==2){
            double valorfinal = 2.50 * kilo ;
            System.out.println("Esse e o valor final da sua compra : " + valorfinal);
        } else if (kilo >5 && type == 1 || type ==2){
            double valor2 =  kilo - (kilo * 0.10);
        }

    }
}
