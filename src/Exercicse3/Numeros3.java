package Exercicse3;

public class Numeros3 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 8, 9, 45, 797, 32, 47};
        int maior = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maior) {
                maior = numbers[i];
            }
            System.out.println("Maior numero = " + maior);
        }
    }
}
