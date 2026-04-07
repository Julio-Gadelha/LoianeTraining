package ProgamacaoBasica.Exercicios;

import java.util.Scanner;

public class LojaTinta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da área em m²: ");
        double area = sc.nextDouble();


        double litrosNecessarios = area / 3;


        double litrosPorLata = 18;


        int latas = (int) Math.ceil(litrosNecessarios / litrosPorLata);

        double precoLata = 80.0;

        double precoTotal = latas * precoLata;

        System.out.println("\nQuantidade de latas: " + latas);
        System.out.println("Preço total: R$ " + precoTotal);

        sc.close();
    }
}
