package Exercicse3;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 10 : ");
        int number = scan.nextInt();

        for (int i = 0; number <10 ; i++) {
            if (number > 10){
                System.out.println("Numero invalido");
                break;
            }else{
                System.out.println("Numero valido ");
                break;
            }
        }
    }
}
