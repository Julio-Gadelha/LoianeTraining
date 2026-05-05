package Heranca.Exercise10.ExercicioReceita;

public class PessoaJuridica extends Contribuinte {
    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        return getRendaBruta() * 0.10;
    }
}
