package EstruturasRepeticao.Exercicse3;

import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números: ");
        int n = sc.nextInt();

        int num, soma = 0;

        System.out.print("Digite um número (0 a 1000): ");
        num = sc.nextInt();

        while (num < 0 || num > 1000) {
            System.out.print("Inválido! Digite novamente: ");
            num = sc.nextInt();
        }

        int maior = num;
        int menor = num;
        soma += num;

        for (int i = 2; i <= n; i++) {
            System.out.print("Digite um número (0 a 1000): ");
            num = sc.nextInt();

            while (num < 0 || num > 1000) {
                System.out.print("Inválido! Digite novamente: ");
                num = sc.nextInt();
            }

            soma += num;

            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
