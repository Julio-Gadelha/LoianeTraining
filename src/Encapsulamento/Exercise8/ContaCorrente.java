package Encapsulamento.Exercise8;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;


    public ContaCorrente(int numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
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
