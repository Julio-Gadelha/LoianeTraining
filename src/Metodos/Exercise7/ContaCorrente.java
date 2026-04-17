package Metodos.Exercise7;

public class ContaCorrente {

    public int numero;
    public double saldo;
    public boolean especial;
    public double limite;


    public void sacar(double valor) {
        if (especial) {
            if (saldo + limite >= valor) {
                saldo -= valor;
                System.out.println("Saque realizado.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque realizado.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }


    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado.");
    }


    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }


    public void verificarEspecial() {
        if (especial) {
            System.out.println("Conta especial.");
        } else {
            System.out.println("Conta normal.");
        }
    }
}
