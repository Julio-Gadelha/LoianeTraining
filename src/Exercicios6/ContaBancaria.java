package Exercicios6;

public class ContaBancaria {
    private String Titular;
    private double saldo ;


    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        if(saldo < 0){
            System.out.println("Seu saldo e nagativo");
        } else {
            System.out.println("Saldo positivo");
        }
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
