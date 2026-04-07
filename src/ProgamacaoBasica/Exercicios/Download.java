package ProgamacaoBasica.Exercicios;

import java.util.Scanner;

public class Download {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho do arquivo (MB): ");
        double tamanhoMB = sc.nextDouble();

        System.out.print("Velocidade da internet (Mbps): ");
        double velocidadeMbps = sc.nextDouble();

        // converter Mbps para MB/s (divide por 8)
        double velocidadeMBps = velocidadeMbps / 8;

        // tempo em segundos
        double tempoSegundos = tamanhoMB / velocidadeMBps;

        // converter para minutos
        double tempoMinutos = tempoSegundos / 60;

        System.out.println("Tempo aproximado de download: " + tempoMinutos + " minutos");

        sc.close();
    }
}
