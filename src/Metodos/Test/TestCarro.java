package Metodos.Test;

import Metodos.Carro;

public class TestCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Sport";
        carro.marca = "Porsche";
        carro.numPassageiros = 4;
        carro.capCombustivel = 10.0;
        carro.consumoCobustivel = 4.00;
        carro.exibirAutonomia();
        carro.obterAutonomia();

        System.out.println("Quantidade de combustível com parametros e  return :");

        double qtdCombustivel = carro.calcularCombustivel(10);
    }
}
