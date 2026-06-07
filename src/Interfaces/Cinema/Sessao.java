package Interfaces.Cinema;

public enum Sessao {
    MANHA(30.50),
    TARDE(27.09),
    NOITE(15.60);

    private final double preco;

    Sessao(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

}

