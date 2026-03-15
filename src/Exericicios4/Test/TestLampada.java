package Exericicios4.Test;

import Exericicios4.Lampada;

public class TestLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.cor = "Branca";
        lampada.valor = 23.00F;
        System.out.println("A Lampada que esta a venda e  da cor " + lampada.cor + "  o valor que ela custa e " +lampada.valor);
    }
}
