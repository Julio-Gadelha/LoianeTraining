package Interfaces.SistemaVeiculo;

public class Moto  extends Veiculo implements Ligavel {


    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada");
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }
}
