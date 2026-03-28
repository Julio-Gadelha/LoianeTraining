package Exercicios2;

import java.util.Scanner;

public class NumeroPorExtenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número menor que 1000: ");
        int num = sc.nextInt();

        if (num >= 1000 || num < 0) {
            System.out.println("Número inválido!");
        } else {
            int centenas = num / 100;
            int dezenas = (num % 100) / 10;
            int unidades = num % 10;

            String resultado = "";


            if (centenas > 0) {
                resultado += centenas + (centenas == 1 ? " centena" : " centenas");
            }


            if (dezenas > 0) {
                if (!resultado.isEmpty()) {
                    resultado += (unidades > 0 ? ", " : " e ");
                }
                resultado += dezenas + (dezenas == 1 ? " dezena" : " dezenas");
            }


            if (unidades > 0) {
                if (!resultado.isEmpty()) {
                    resultado += " e ";
                }
                resultado += unidades + (unidades == 1 ? " unidade" : " unidades");
            }

            System.out.println(resultado);
        }

        sc.close();
    }
}