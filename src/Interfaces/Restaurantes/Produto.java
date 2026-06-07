package Interfaces.Restaurantes;

public  abstract class Produto  implements Pedivel{
    private String nome;
    private double preco;
    private Categoria categoria;

    public Produto(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public abstract double calcularPreco();
    @Override
    public String toString() {
        return
                " Prato: " + nome + "\n" +
                " Categoria: " + categoria + "\n" +
                " Tempo de preparo: " + categoria.getTempoPreparo() + " minutos\n" +
                " Preco base: R$" +  preco + "\n" +
                " Preco final: R$" +  calcularPreco() + "\n" +
                "══════════════════════════════";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
