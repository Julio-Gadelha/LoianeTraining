package Heranca.Exercise10.ExercicioConta;


public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        }
    }

    public void sacar(double valorSacar) {
        if (valorSacar <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        if (this.saldo < valorSacar) {
            System.out.println("Saldo baixo!");
        } else {
            this.saldo -= valorSacar;
        }
    }

    public double retornarSaldoAtual() {
        return this.saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeCliente +
                "\nConta: " + numConta +
                "\nSaldo: " + saldo;
    }

}
