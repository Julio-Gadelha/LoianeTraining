package Exercicios5.Test;

import Exercicios5.Lampada;

public class TestLampada {
    public static void main(String[] args) {
        Lampada abajur = new Lampada();

        abajur.ligar();

        abajur.mostrarEstadoDaLampada();

        abajur.desligar();

        abajur.mostrarEstadoDaLampada();

    }
}
