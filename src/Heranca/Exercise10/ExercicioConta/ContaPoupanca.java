package Heranca.Exercise10.ExercicioConta;

public class ContaPoupanca extends ContaBancaria {

    public void aplicarRendimento(double percentual) {
        if (percentual > 0) {
            double rendimento = retornarSaldoAtual() * (percentual / 100);
            depositar(rendimento);
        }
    }
}
