package Exericicios4.Test;

import Exericicios4.Livro;

public class TestLivro {
    public static void main(String[] args) {
        Livro chumelabs = new Livro();
        chumelabs.nome = " A fuga impossivel ";
        chumelabs.tipo = "Ação";
        chumelabs.valor = 30.00F;

        System.out.println("O livro " + chumelabs.nome + " do tipo " + chumelabs.tipo + ", vai custar apenas " + chumelabs.valor);
    }
}
