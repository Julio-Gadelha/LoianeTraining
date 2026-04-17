package Metodos.Test;

import Metodos.Exercise7.ContaCorrente;

public class TestConta {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numero = 123;
        conta.saldo = 1000;
        conta.especial = true;
        conta.limite = 500;

        conta.consultarSaldo();
        conta.sacar(1200);
        conta.consultarSaldo();
        conta.verificarEspecial();
    }
}
