package Interfaces.Exercise;

public class Pix implements Pagamento {


    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado no Pix: " + valor );
    }


}
