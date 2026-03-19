package Exercicios2;

import java.util.Scanner;

public class Vitima {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para vitima ?  ");
        String a = scan.nextLine();
        System.out.println("Esteve no local do crime ?  ");
        String b = scan.nextLine();
        System.out.println("Mora perto da vitima ? ");
        String c = scan.nextLine();
        System.out.println("Ja trabalhou com a vitima ? ");
        String d = scan.nextLine();
        scan.close();

        if (a == "Sim" && b == "Sim" && c == "Não" && d == "Não") {
            System.out.println("Suspeita ");
        } else if (a == "Sim" && b == "Sim" && c == "Sim" && d == "Não" || (a == "Sim" && b == "Sim" && c == "sim" && d == "sim") ){
            System.out.println("Cumplice ");
        }
    }
}
