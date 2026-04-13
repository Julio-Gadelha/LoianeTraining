package Poo.TesteCarro;

import Poo.Exercise6.Livro;

public class TestLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "Esquecerem de mim";
        livro.type = "Ansiedade ";
        livro.value = 100.00;

        System.out.println(livro.nome);
        System.out.println(livro.type);
        System.out.println(livro.value);


    }
}
