package Heranca.Exercise10.ExercicioConta;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valorSacar) {
        if (valorSacar <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        if (retornarSaldoAtual() + limite >= valorSacar) {
            setSaldo(retornarSaldoAtual() - valorSacar);
        } else {
            System.out.println("Saldo baixo!");
        }
    }
}