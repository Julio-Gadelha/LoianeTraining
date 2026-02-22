package Exercicios2;

import java.util.Scanner;

public class Tabajara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salario : ");
        float salario = scan.nextFloat();
        scan.close();
        System.out.println("Salario : " + salario);
        if (salario > 280 && salario < 280) {
            System.out.println(salario + (salario * 0.20));
        } else if (salario > 280 && salario < 700) {
            System.out.println(salario + (salario * 0.15));
        } else if (salario >= 700 && salario < 1500) {
            System.out.println(salario + (salario * 0.10));
        } else if (salario > 1500) {
            System.out.println(salario + (salario * 0.05));
        }

    }
}
