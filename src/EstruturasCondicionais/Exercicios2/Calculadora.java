package EstruturasCondicionais.Exercicios2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado = 0;

        switch (op) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);


        if (resultado == Math.floor(resultado)) {
            if (((int) resultado) % 2 == 0) {
                System.out.println("É par.");
            } else {
                System.out.println("É ímpar.");
            }
        } else {
            System.out.println("Não é possível classificar como par ou ímpar.");
        }


        if (resultado > 0) {
            System.out.println("É positivo.");
        } else if (resultado < 0) {
            System.out.println("É negativo.");
        } else {
            System.out.println("É zero.");
        }


        if (resultado == Math.floor(resultado)) {
            System.out.println("É inteiro.");
        } else {
            System.out.println("É decimal.");
        }

        sc.close();
    }
}
