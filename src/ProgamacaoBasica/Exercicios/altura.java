package ProgamacaoBasica.Exercicios;

import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float altura = sc.nextFloat();

        System.out.println("Digite seu peso: ");
        float peso = sc.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        sc.close();
    }
}
