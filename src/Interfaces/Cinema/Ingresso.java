package Interfaces.Cinema;

public abstract class Ingresso implements Reservavel {
    private String filme;
    private int assento;
    private Sessao sessao;

    public Ingresso(String filme, int assento, Sessao sessao) {
        this.filme = filme;
        this.assento = assento;
        this.sessao = sessao;
    }
    public abstract double calcularPreco();

    public abstract void cancelarReserva();

    @Override
    public String toString() {
        return
                "Filme: " + filme + "\n" +
                "Assento: " + assento + "\n" +
                "Sessao: " + sessao + "\n" +
                "Preco base: R$" + String.format("%.2f", sessao.getPreco()) + "\n" +
                " Preco final: R$" + String.format("%.2f", calcularPreco()) + "\n" +
                "══════════════════════════════";
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}
