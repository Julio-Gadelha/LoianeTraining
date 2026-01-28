package Scanner;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual e o seu nome ? ");
        String nome = scan.nextLine();
        System.out.println("Qual e a sua idade ? ");
        int idade = scan.nextInt();
        scan.close();
        System.out.println("Seja bem vindo! "+nome);
    }

}
