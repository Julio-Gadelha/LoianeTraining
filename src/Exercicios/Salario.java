package Exercicios;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quanto Você ganha por hora : ");
        double salario = scan.nextDouble();
        System.out.println("Digite o seu numero de horas trabalha por mês : ");
        double horas = scan.nextDouble();
        double resultado = salario * horas;
        System.out.println("O seu salario e de : " + resultado);
    }
}
