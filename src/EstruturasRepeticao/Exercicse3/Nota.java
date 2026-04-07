package EstruturasRepeticao.Exercicse3;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        do {
            System.out.println("Digite um numero de 1 a 10: ");
            number = scan.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Numero invalido, tente novamente!");
            }

        } while (number < 1 || number > 10);

        System.out.println("Numero valido!");

        scan.close();
    }
}
