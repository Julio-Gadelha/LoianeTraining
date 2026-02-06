package Exercicios2;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        double sal = 5.00;
        double feijao = 10.00;
        double arroz = 20.00;

        Scanner scan = new Scanner(System.in);
        System.out.println("O preço dos três produtos a venda ");
        System.out.println("O preços são, sal : " + sal + " feijão:  " + feijao+ ",arroz : "+arroz);
        scan.close();

        if (sal < feijao && sal < arroz){
            System.out.println("Esse e o produto certo a comprar:  "+sal);
        } else if(feijao < sal && feijao < arroz){
            System.out.println("Esse e o produto certo a comprar: "+feijao);
        } else if(arroz < sal && arroz < feijao){
            System.out.println("Esse e o produto certo a comprar: "+arroz);
        }
    }
}
