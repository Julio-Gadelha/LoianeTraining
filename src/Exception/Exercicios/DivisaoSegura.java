package Exception.Exercicios;

import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero interiro : ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero interiro : ");
        int num2 = sc.nextInt();
        try{
            int resultado = num1 / num2;
            System.out.println("Resultado :  " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Erro: não é possível dividir por zero!");
            e.getMessage();
        }
        sc.close();
    }
}
