package EstruturasRepeticao.Exercicse3;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean primo = true;
        int i = 2;

        if (num <= 1) {
            primo = false;
        } else {
            do {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
                i++;
            } while (i < num);
        }

        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

        sc.close();
    }
}
