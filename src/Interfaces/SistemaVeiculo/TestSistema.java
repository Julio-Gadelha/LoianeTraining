package Interfaces.SistemaVeiculo;

public class TestSistema {
    public static void main() {
        Moto moto = new Moto();
        moto.ligar();
        moto.acelerar();
        System.out.println("-------------");
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar();
        carro.desligar();

    }
}
