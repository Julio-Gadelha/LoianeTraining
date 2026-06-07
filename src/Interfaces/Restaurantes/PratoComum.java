package Interfaces.Restaurantes;

public class PratoComum  extends Produto{
    public PratoComum(String nome, double preco, Categoria categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public double calcularPreco() {
        return getPreco() ;
    }

    @Override
    public void fazerPedido() {
        System.out.println(" Pedido do prato " + getNome() + " realizado!");
        System.out.println(" Tempo estimado: " + getCategoria().getTempoPreparo() + " minutos");
    }

    @Override
    public void cancelarPedido() {
        System.out.println(" Pedido do prato " + getNome() + " cancelado!");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Tipo: Prato Comum\n" +
                "══════════════════════════════";
    }
}
