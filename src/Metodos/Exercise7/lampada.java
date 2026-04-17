package Metodos.Exercise7;

public class lampada {

    boolean ligada;

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
