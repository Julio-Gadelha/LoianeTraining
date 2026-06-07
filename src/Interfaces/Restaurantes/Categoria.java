package Interfaces.Restaurantes;

public enum Categoria {
    ENTRADA(10),
    PRATO_PRINCIPAL(30),
    SOBREMESSA(15);

    private final int tempoPreparo;

    Categoria(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }
}
