package Exercicios2;

import java.util.Scanner;

public class Sexo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu sexo");
        String sexo =  scan.nextLine();
        scan.close();

        if (sexo == "Feminino " || sexo == "F"){
            System.out.println(" E do sexo feminino");
        } else{
            System.out.println("Masculino ");
        }


    }
}
