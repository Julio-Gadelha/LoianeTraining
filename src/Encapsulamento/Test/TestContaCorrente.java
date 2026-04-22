package Encapsulamento.Test;


import Encapsulamento.Exercise8.ContaCorrente;

public class TestContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(12,30.0,true,600.00);
        contaCorrente.consultarSaldo();
    }
}
