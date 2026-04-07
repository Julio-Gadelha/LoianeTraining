package ProgamacaoBasica.Exercicios;

import java.util.Scanner;

public class Ios {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Digite seu primeiro numero : ");
         int num1 = sc.nextInt();
         System.out.println("Digite seu Segundo  numero : ");
         int num2 = sc.nextInt();
         sc.close();
          int result = num2 * num1;
    }
}
