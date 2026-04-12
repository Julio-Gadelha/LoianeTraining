package Arrays.Multidimensionais.Exercise5;

import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        int[][] M = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = rand.nextInt(10);
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        int maiorLinha = M[4][0];
        int menorLinha = M[4][0];

        for (int j = 0; j < 10; j++) {
            if (M[4][j] > maiorLinha) maiorLinha = M[4][j];
            if (M[4][j] < menorLinha) menorLinha = M[4][j];
        }

        int maiorColuna = M[0][6];
        int menorColuna = M[0][6];

        for (int i = 0; i < 10; i++) {
            if (M[i][6] > maiorColuna) maiorColuna = M[i][6];
            if (M[i][6] < menorColuna) menorColuna = M[i][6];
        }

        System.out.println("Maior da linha 5: " + maiorLinha);
        System.out.println("Menor da linha 5: " + menorLinha);
        System.out.println("Maior da coluna 7: " + maiorColuna);
        System.out.println("Menor da coluna 7: " + menorColuna);
    }
}
