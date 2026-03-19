package Exercicios2;

import java.util.Scanner;

public class Triangulo {
   public  static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

       System.out.println("Digite o valor do primeiro lado do triangulo : ");
       int lado1 = scan.nextInt();
       System.out.println("Digite o valor do segundo  lado do triangulo : ");
       int lado2 = scan.nextInt();
       System.out.println("Digite o valor do terceiro lado do triangulo : ");
       int lado3 = scan.nextInt();



       if ( lado1 == lado2 && lado1 == lado3){
           System.out.println(("Triangulo equilatero "));
       } else if (lado1 == lado2 && lado1 != lado3){
           System.out.println("Triangulo  isósceles  ");
       } else if( lado1 != lado2 && lado1 != lado3){
           System.out.println("Triangulo escaleno ");
       }



    }
}
