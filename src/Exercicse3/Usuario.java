package Exercicse3;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome ");
        String nome = scan.nextLine();
        System.out.println("Digite sua senha");
        String password = scan.nextLine();
        scan.close();

        while( password == nome){
            System.out.println("Não pode ");
            break;
        }
        do{
            System.out.println("valido");
            break;
        } while( password != nome);

        }


}
