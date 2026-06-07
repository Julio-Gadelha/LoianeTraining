package Interfaces.Restaurantes;

public class TestRestaurante {
    public static void main(String[] args) {
        Produto comum = new PratoComum("Frango Grelhado", 45.0, Categoria.PRATO_PRINCIPAL);
        Produto vegano = new PratoVegano("Salada ", 20.0, Categoria.ENTRADA, "Grao de bico, tomate, alface, abacate");

        System.out.println(comum);
        comum.fazerPedido();

        System.out.println();

        System.out.println(vegano);
        vegano.fazerPedido();

        System.out.println();

        System.out.println("--- CANCELAMENTOS ---");
        comum.cancelarPedido();
        vegano.cancelarPedido();
    }
}
