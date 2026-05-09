package Interfaces.Exercise;

public class FolhaPagamento {
    public static void main(String[] args) {
        Pix pix = new Pix();
        CartaoCredito cartaoCredito = new CartaoCredito();
        pix.realizarPagamento(500);
        cartaoCredito.realizarPagamento(700);
    }
}
