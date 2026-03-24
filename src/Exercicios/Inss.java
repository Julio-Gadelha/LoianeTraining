package Exercicios;
import java.util.Scanner;
public class Inss {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Quanto você ganha por hora? R$ ");
         double valorHora = sc.nextDouble();

         System.out.print("Quantas horas trabalhou no mês? ");
         double horas = sc.nextDouble();

         double salarioBruto = valorHora * horas;

         double ir = salarioBruto * 0.11;
         double inss = salarioBruto * 0.08;
         double sindicato = salarioBruto * 0.05;

         double descontos = ir + inss + sindicato;
         double salarioLiquido = salarioBruto - descontos;

         System.out.println("\n+ Salário Bruto : R$ " + salarioBruto);
         System.out.println("- IR (11%) : R$ " + ir);
         System.out.println("- INSS (8%) : R$ " + inss);
         System.out.println("- Sindicato (5%) : R$ " + sindicato);
         System.out.println("= Salário Líquido : R$ " + salarioLiquido);

         sc.close();
    }
}
