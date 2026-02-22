package Exercicios2;

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu primeiro numero : ");
        int number1 = scan.nextInt();
        System.out.println("Digite o seu segundo numero : ");
        int number2 = scan.nextInt();
        System.out.println("Digite o seu terceiro numero : ");
        int number3 = scan.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println("E o menor numero : " + number1);
        } else if (number2 < number1 && number2 < number3) {
            System.out.println("E o menor numero : " + number2);
        } else if (number3 < number1 && number3 < number2){
            System.out.println("E o menor numero ");
        }


    }
}
