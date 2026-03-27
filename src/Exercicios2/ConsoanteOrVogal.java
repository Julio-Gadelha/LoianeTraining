package Exercicios2;

import java.util.Scanner;

public class ConsoanteOrVogal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);
        sc.close();

        if (letra >= 'a' && letra <= 'z') {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("É uma vogal.");
            } else {
                System.out.println("É uma consoante.");
            }
        } else {
            System.out.println("Não é uma letra válida.");
        }

    }
}


