package Poo.TesteCarro;

import Poo.Exercise6.Lampada;

public class TestLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.color = "white";
        lampada.value = 30.00;

        System.out.println(lampada.color);
        System.out.println(lampada.value);
    }
}
