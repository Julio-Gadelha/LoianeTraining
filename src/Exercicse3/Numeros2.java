package Exercicse3;

public class Numeros2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int soma = 0;
        for (int i=0; i < numbers.length; i++){
            soma = soma + numbers[i];
        }
        System.out.println("O resultado e : " + soma);
    }
}
