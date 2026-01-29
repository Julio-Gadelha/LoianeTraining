package IfElse;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade ");
        int idade = scan.nextInt();
        scan.close();

        if (idade >= 18) {
            System.out.println("Parabens, Você virou adulto.");
        } else {
            System.out.println("Ainda e adolescente");
        }
    }
}
