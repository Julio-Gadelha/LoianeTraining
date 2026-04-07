package EstruturasCondicionais.Exercicios2;

import java.util.Scanner;

public class InteiroOuDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        if (num == Math.floor(num)) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }

        sc.close();
    }
}
