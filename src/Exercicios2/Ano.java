package Exercicios2;

import java.util.Scanner;

public class Ano {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano em que Você nasceu : ");
        String ano = scan.nextLine();
        System.out.println("Agora fale quantos dias ele tem  : ");
        int dias = scan.nextInt();
        scan.close();

        if(dias  == 365 ){
            System.out.println("Este ano não e bissexto : " + ano );
        } else if (dias == 366){
            System.out.println("Esse ano e Bissexto : " + ano);
        }

    }
}
