package Construtores;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular,double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void exibirConta() {
        System.out.println(" Titulo : " + titular);
        System.out.println("Saldo : " + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
