package Exercicios2;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite apenas a primeira letra do seu horario : ");
        String turno = scan.nextLine();
        scan.close();


        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde!");
        } else if(turno.equalsIgnoreCase("N")){
            System.out.println("Boa noite!");
        }
    }
}
