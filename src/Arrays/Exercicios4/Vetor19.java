package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a Nota 1: ");
            nota1[i] = sc.nextDouble();

            System.out.print("Digite a Nota 2: ");
            nota2[i] = sc.nextDouble();

            result[i] = (nota1[i] + nota2[i]) / 2;
        }

           for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1) + " - Média: " + result[i]);

            if (result[i] >= 7) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }

        sc.close();
    }
}
