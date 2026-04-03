package Exercicse3;

public class Fibonaci2 {
    public static void main(String[] args) {

        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        while (true) {
            int c = a + b;
            System.out.print(c + " ");

            if (c > 500) {
                break;
            }

            a = b;
            b = c;
        }
    }
}
