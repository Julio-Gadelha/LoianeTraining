package Exercicios2;

import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual valor da sua hora trabalhada : ");
        int horas = scan.nextInt();
        System.out.println("Qual sua quantidade de horas trabalhada no mês : ");
        int trabalhadas = scan.nextInt();
        scan.close();
        double  salario = horas * trabalhadas;
        if(salario  >= 900  &&  salario <900 ){
            System.out.println("Insento");
        } else if (salario >=  1500){
          double   desconto = salario - (salario * 0.10);
            System.out.println("Salario bruto : " + salario);
            System.out.println("Desconto do IR  0.10" );
            System.out.println("Salario liquido : " + desconto);
        } else if( salario >= 2500){
            double   desconto = salario - (salario * 0.20);
            System.out.println("Salario bruto : " + salario);
            System.out.println("Desconto do IR : 0.20 ");
            System.out.println("Salario liquido :  " + desconto);
        }
    }
}
