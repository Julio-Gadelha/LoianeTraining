package EstruturasRepeticao.Exercicse3;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, maior;


        System.out.print("Digite um número: ");
        maior = sc.nextInt();


        for (int i = 1; i < 5; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}