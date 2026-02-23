package Exercicios2;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7: ");
        int dia = scan.nextInt();
        scan.close();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7 :
                System.out.println("Sabado");
                break;
            case 8 :
                System.out.println("Numero invalido,tente outro! ");
                break;
        }
    }
}
