package Exception.Exercicios;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero ");
        String  entrada = scanner.nextLine();


        try{
            int numero = Integer.parseInt(entrada);
            System.out.println(" O numero tipo texto foi convertido  :  " + numero);
        } catch (NumberFormatException e){
            System.out.println("Entrada inválida! Você precisa digitar apenas números. ");
            e.getMessage();
        }
        scanner.close();




    }
}
