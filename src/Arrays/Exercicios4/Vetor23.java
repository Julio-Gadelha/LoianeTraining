package Arrays.Exercicios4;

import java.util.Scanner;

public class Vetor23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i <10 ; i++) {
            System.out.println("Digite os numeros: ");
            A[i] = sc.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            if ( A[i] %2 ==0){
                System.out.println("os numeros são pares : " + A[i] );
                break;
            } else{
                System.out.println("Nâo são pares :  " + A[i]);
                break;
            }
        }

        sc.close();

    }
}
