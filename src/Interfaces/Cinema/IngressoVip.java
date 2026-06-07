package Interfaces.Cinema;

public class IngressoVip extends Ingresso{
    public IngressoVip(String filme, int assento, Sessao sessao) {
        super(filme, assento, sessao);
    }

    @Override
    public double calcularPreco() {
        return getSessao().getPreco() * 1.50;
    }

    @Override
    public void cancelarReserva() {
        System.out.println(" Reserva do Ingresso VIP cancelada!");
    }

    @Override
    public void reservarIngresso() {
        System.out.println(" Ingresso VIP reservado!");
        System.out.println(" Poltrona reclinavel: " + getAssento());
        System.out.println(" Pipoca inclusa!");
    }

    @Override
    public void cancelarReservar() {

    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Tipo: VIP" +
                "\n Pipoca inclusa!" +
                "\n Poltrona reclinavel!\n" +
                "══════════════════════════════";
    }
}
