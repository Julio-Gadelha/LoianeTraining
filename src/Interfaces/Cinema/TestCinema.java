package Interfaces.Cinema;

public class TestCinema {
    public static void main(String[] args) {

        Ingresso vip = new IngressoVip("Homem Aranha", 2, Sessao.NOITE);


        System.out.println();

        System.out.println(vip);
        vip.reservarIngresso();

        System.out.println();

        System.out.println("--- CANCELAMENTOS ---");

        vip.cancelarReserva();
    }
}
