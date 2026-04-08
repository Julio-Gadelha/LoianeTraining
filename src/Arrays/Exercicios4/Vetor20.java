package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cotacao;
        double[] A = new double[20];

        System.out.print("Digite a cotação do dólar: ");
        cotacao = sc.nextDouble();


        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um valor em dólar: ");
            double dolar = sc.nextDouble();

            A[i] = dolar * cotacao;
        }


        System.out.println("\nValores convertidos em reais:");
        for (int i = 0; i < 20; i++) {
            System.out.println("R$ " + A[i]);
        }

        sc.close();
    }
}
