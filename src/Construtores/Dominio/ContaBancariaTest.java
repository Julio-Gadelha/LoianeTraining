package Construtores.Dominio;

import Construtores.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Carlos", 1000);

        conta1.depositar(500);

        conta1.exibirConta();


    }
}
