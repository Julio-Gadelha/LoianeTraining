package Heranca.Exercise10;


import Heranca.Exercise10.ExercicioConta.ContaPoupanca;

public class TestConta {
    public static void main(String[] args) {

        ContaPoupanca conta = new ContaPoupanca();
        conta.setNomeCliente("João");
        conta.setNumConta(123);
        conta.setSaldo(500);

        conta.depositar(500);
        System.out.println("Saldo após depósito: " + conta.retornarSaldoAtual());

        System.out.println("-------------");

        conta.sacar(900);
        System.out.println("Saldo após saque: " + conta.retornarSaldoAtual());

        System.out.println("-------------");

        conta.aplicarRendimento(10);
        System.out.println("Saldo após rendimento: " + conta.retornarSaldoAtual());

        System.out.println("-------------");
        System.out.println(conta);
    }
}
