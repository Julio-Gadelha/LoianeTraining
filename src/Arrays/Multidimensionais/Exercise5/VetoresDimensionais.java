package Arrays.Multidimensionais.Exercise5;

import java.util.Random;

public class VetoresDimensionais {
    public static void main(String[] args) {
        int[][] M = new int[4][4];
        Random rand = new Random();

        int maior = -1;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                M[i][j] = rand.nextInt(10); // 0 a 9
                System.out.print(M[i][j] + " ");

                if (M[i][j] > maior) {
                    maior = M[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
            System.out.println();
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Posição: (" + linhaMaior + ", " + colunaMaior + ")");
    }
}
