package Exercicse3;

import java.util.Scanner;


public class Pessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo, estado;

        System.out.print("Digite o nome: ");
        nome = sc.next();
        while (nome.length() <= 3) {
            System.out.print("Nome inválido! Digite novamente: ");
            nome = sc.next();
        }

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.print("Idade inválida! Digite novamente: ");
            idade = sc.nextInt();
        }

        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();
        while (salario <= 0) {
            System.out.print("Salário inválido! Digite novamente: ");
            salario = sc.nextDouble();
        }

        System.out.print("Digite o sexo (f/m): ");
        sexo = sc.next().charAt(0);
        while (sexo != 'f' && sexo != 'm') {
            System.out.print("Sexo inválido! Digite novamente: ");
            sexo = sc.next().charAt(0);
        }

        System.out.print("Digite o estado civil (s/c/v/d): ");
        estado = sc.next().charAt(0);
        while (estado != 's' && estado != 'c' && estado != 'v' && estado != 'd') {
            System.out.print("Estado civil inválido! Digite novamente: ");
            estado = sc.next().charAt(0);
        }

        System.out.println("\nDados válidos!");
    }
}