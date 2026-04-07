package ProgamacaoBasica.Exercicios;

import java.util.Scanner;

public class Festa {
    public static void main(String[] args) {
     Scanner  sc = new Scanner(System.in);
        System.out.println("Digite sua altura : ");
        float altura = sc.nextFloat();
        System.out.println("Digite seu peso  : ");
        float peso = sc.nextFloat();
        System.out.println("Digite seu sexo  [1] = Homem [2] = Mulher : ");
        int sexo = sc.nextInt();
        sc.close();

         float ideal  = (peso * altura) - 58;
        System.out.println("O peso e : ");

    }
}
