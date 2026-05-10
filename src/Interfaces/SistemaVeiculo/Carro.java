package Interfaces.SistemaVeiculo;

public class Carro extends Veiculo implements Ligavel {


    @Override
    public void ligar() {
        System.out.println("Carro ligado ");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }
}
