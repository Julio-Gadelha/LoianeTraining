package Interfaces.Cinema;

public abstract class IngressoComum extends Ingresso {
    public IngressoComum(String filme, int assento, Sessao sessao) {
        super(filme, assento, sessao);
    }

    @Override
    public double calcularPreco() {
        return getSessao().getPreco();
    }

    @Override
    public void reservarIngresso() {
        System.out.println(" Ingresso Comum reservado!");
        System.out.println(" Assento: " + getAssento());
    }

    @Override
    public void cancelarReservar() {
        System.out.println(" Reserva do Ingresso Comum cancelada!");
    }


    @Override
    public String toString() {
        return super.toString() +
                "\n Tipo: Comum\n" +
                "══════════════════════════════";
    }
}
