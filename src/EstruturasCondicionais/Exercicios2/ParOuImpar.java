package EstruturasCondicionais.Exercicios2;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro : ");
        int numero = scan.nextInt();
        scan.close();
        if(numero %2 ==0){
            System.out.println("Par");
        } else{
            System.out.println("Impar");
        }
    }
}
