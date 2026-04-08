package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade: ");
            A[i] = sc.nextInt();
        }

        int menor = A[0];
        int maior = A[0];
        int posMenor = 0;
        int posMaior = 0;

        for (int i = 1; i < 10; i++) {
            if (A[i] < menor) {
                menor = A[i];
                posMenor = i;
            }
            if (A[i] > maior) {
                maior = A[i];
                posMaior = i;
            }
        }

        System.out.println("Menor idade: " + menor + " na posição: " + posMenor);
        System.out.println("Maior idade: " + maior + " na posição: " + posMaior);

        sc.close();
    }
}
