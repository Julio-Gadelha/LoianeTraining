package Poo.TesteCarro;

import Poo.Carro;

public class TestCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.cor = "Black";
        carro.Marca = "Porsche";
        carro.numeroDePassageiros = 4;
        carro.CapacidadeCombustivel = 200.0;
        carro.ConsumoDeCombustivel = 20.00;
        System.out.println("O Carro da cor " + carro.cor + "Do modelo " + carro.Marca  );
    }
}
