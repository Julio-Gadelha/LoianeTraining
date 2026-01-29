package SwithCase;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero do dia da semana ");
        int dia = scan.nextInt();
        scan.close();
        System.out.println("O dia da semana e : " + dia);
        switch (dia) {
            case 1:
                System.out.println("Domingo ");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Não existe mais dias ");
        }

    }
}
