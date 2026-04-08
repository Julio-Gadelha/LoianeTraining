package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        int somaMenores = 0;
        int qtdIguais = 0;
        int somaMaiores = 0;
        int qtdMaiores = 0;


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            if (A[i] < 15) {
                somaMenores += A[i];
            } else if (A[i] == 15) {
                qtdIguais++;
            } else { // maior que 15
                somaMaiores += A[i];
                qtdMaiores++;
            }
        }


        double mediaMaiores = 0;
        if (qtdMaiores > 0) {
            mediaMaiores = (double) somaMaiores / qtdMaiores;
        }

        System.out.println("Soma dos menores que 15: " + somaMenores);
        System.out.println("Quantidade iguais a 15: " + qtdIguais);
        System.out.println("Média dos maiores que 15: " + mediaMaiores);

        sc.close();
    }
}
