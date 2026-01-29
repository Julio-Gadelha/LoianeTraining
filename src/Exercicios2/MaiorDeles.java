package Exercicios2;

import java.util.Scanner;

public class MaiorDeles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeriro numero ");
        int numero = scan.nextInt();
        System.out.println("Digite o segundo numero");
        int numero2 = scan.nextInt();
        scan.close();

        if (numero > numero2){
            System.out.println("Numero 1 maior ");
        } else{
            System.out.println("Numero dois maior");
        }

    }
}
