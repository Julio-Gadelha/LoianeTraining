package EstruturasCondicionais.Exercicios2;
import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int valor = sc.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido! Deve ser entre 10 e 600.");
        } else {
            int notas100 = valor / 100;
            valor = valor % 100;

            int notas50 = valor / 50;
            valor = valor % 50;

            int notas10 = valor / 10;
            valor = valor % 10;

            int notas5 = valor / 5;
            valor = valor % 5;

            int notas1 = valor;

            System.out.println("Notas fornecidas:");
            if (notas100 > 0) System.out.println(notas100 + " nota(s) de 100");
            if (notas50 > 0) System.out.println(notas50 + " nota(s) de 50");
            if (notas10 > 0) System.out.println(notas10 + " nota(s) de 10");
            if (notas5 > 0) System.out.println(notas5 + " nota(s) de 5");
            if (notas1 > 0) System.out.println(notas1 + " nota(s) de 1");
        }

        sc.close();
    }
}
