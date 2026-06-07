package Interfaces.Restaurantes;

public class PratoVegano  extends  Produto{
    private String ingredientes;

    public PratoVegano(String nome, double preco, Categoria categoria, String ingredientes) {
        super(nome, preco, categoria);
        this.ingredientes = ingredientes;
    }

    @Override
    public double calcularPreco() {
        double ValorPagar =  getPreco() - (getPreco() * 0.10);
        return ValorPagar;
    }

    @Override
    public void fazerPedido() {
        System.out.println(" Pedido vegano " + getNome() + " realizado!");
        System.out.println(" Ingredientes: " + ingredientes);
        System.out.println(" Tempo estimado: " + getCategoria().getTempoPreparo() + " minutos");
    }

    @Override
    public void cancelarPedido() {
        System.out.println(" Pedido vegano " + getNome() + " cancelado!");
    }
    @Override
    public String toString() {
        return super.toString() +
                "\n Tipo: Prato Vegano" +
                "\n Ingredientes: " + ingredientes +
                "\n Desconto vegano de 10% aplicado!\n" +
                "═";
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
