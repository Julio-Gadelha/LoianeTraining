package Exercicios6.Tests;

import Exercicios6.ContaBancaria;

public class TestContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setTitular("Gabriel");
        contaBancaria.setSaldo(2000.00);

        System.out.println("Hello everbody , eu tenho um salario que equivale : " + contaBancaria.getSaldo());
    }
}
