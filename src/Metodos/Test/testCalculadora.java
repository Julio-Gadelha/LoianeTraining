package Metodos.Test;

import Metodos.Exercise7.Calculadora;

public class testCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Todos os resultados ");
        calculadora.somarNumeros();
        calculadora.subtrairNumeros();
        calculadora.multiNumeros();
        calculadora.dividirNumeros();


    }
}
