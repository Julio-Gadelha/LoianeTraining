package EstruturasRepeticao.Exercicse3;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        String senha;

        do {
            System.out.println("Digite o nome do usuário:");
            nome = scan.nextLine();

            System.out.println("Digite sua senha:");
            senha = scan.nextLine();

            if (nome.equals(senha)) {
                System.out.println("Digite outra senha!");
            }

        } while (nome.equals(senha));

        System.out.println("Sua senha foi aceita");
        scan.close();
    }
}