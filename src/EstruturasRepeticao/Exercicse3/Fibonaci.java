package EstruturasRepeticao.Exercicse3;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos termos: ");
        int n = sc.nextInt();

        int a = 1, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        sc.close();
    }
}
