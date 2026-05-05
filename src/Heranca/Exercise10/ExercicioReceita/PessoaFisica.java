package Heranca.Exercise10.ExercicioReceita;

public class PessoaFisica extends Contribuinte {
    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        double renda = getRendaBruta();

        if (renda <= 1400) {
            return 0;
        } else if (renda <= 2100) {
            return (renda * 0.10) - 100;
        } else if (renda <= 2800) {
            return (renda * 0.15) - 270;
        } else if (renda <= 3600) {
            return (renda * 0.25) - 500;
        } else {
            return (renda * 0.30) - 700;
        }
    }
}
