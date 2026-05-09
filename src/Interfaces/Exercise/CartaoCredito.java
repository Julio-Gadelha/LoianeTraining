package Interfaces.Exercise;

public class CartaoCredito implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado no Cartão: " + valor);
    }


}
