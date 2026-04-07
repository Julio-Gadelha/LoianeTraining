package EstruturasCondicionais.Exercicios2;

import java.util.Scanner;

public class NotasParciais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua primeira nota : ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua Segunda nota : ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota : ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) /2;


        if( media >= 7){
            System.out.println("Aprovado : " + media);
        }else if (media == 10){
            System.out.println("Aprovado com distinção : " + media);
        } else{
            System.out.println("Reprovado : " + media);
        }
    }
}
