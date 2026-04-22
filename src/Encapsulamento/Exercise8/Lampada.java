package Encapsulamento.Exercise8;

public class Lampada {

    private boolean ligada;


    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        ligada = true;
        System.out.println("A lâmpada está ligada.");
    }


    public void desligar() {
        ligada = false;
        System.out.println("A lâmpada está desligada.");
    }


    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }
}
