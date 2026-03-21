package Exercicse3;

import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome : ");
        String nome = scan.nextLine();
        System.out.println("Digite sua idade : ");
        int idade = scan.nextInt();
        System.out.println("Digite seu salario : ");
        double salario = scan.nextDouble();
        System.out.println("Digite seu genero : ");
        String sexo = scan.nextLine();
        System.out.println("Digite seu estado civil : ");
        String estado = scan.nextLine();
        scan.close();


    }
}
