package Exercicios2;

import java.io.File;
import java.util.Scanner;

public class Hipermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informaçãoes  comidas supermercado opções : [1] = File Duplo [2] = alcantara [3] = Picaha  ");
        int produto = sc.nextInt();
        System.out.println("Qual a quantidade de produto : ");
        int quantidade = sc.nextInt();
        sc.close();
        float FileDuplo = 4.90F ;
        float Alcatra = 5.90F;
        float Picanha = 6.90F;


        if( produto == 1 &&  quantidade < 5){
             float valorTotal = FileDuplo * quantidade;
            System.out.println("O valor e  : " + valorTotal);
        }
    }

}
