package Exercicios2;

import java.util.Scanner;

public class MediaProva {
    public static void main(String[] args) {
        Scanner scan = new  Scanner (System.in);
        System.out.println("Digite a sua primeira nota : ");
        int  nota1 = scan.nextInt();
        System.out.println("Digite a sua segunda  nota : ");
        int  nota2 = scan.nextInt();
        System.out.println("Digite a sua terceira  nota : ");
        int nota3 = scan.nextInt();

        int media = (nota1 + nota2 + nota3) /3;

        if(media >= 7 ){
            System.out.println("Aprovado : " + media );
        } else if ( media <7){
            System.out.println("Reprovado : " + media);
        } else if (media ==10 ){
            System.out.println("Pode ir para o ITA");
        }


    }
}
