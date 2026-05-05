package Heranca.Exercise10;

import Heranca.Exercise10.ExercicioReceita.Contribuinte;
import Heranca.Exercise10.ExercicioReceita.PessoaFisica;
import Heranca.Exercise10.ExercicioReceita.PessoaJuridica;

public class TestReceita {
    public static void main(String[] args) {
        Contribuinte[] contribuintes = new Contribuinte[6];

        contribuintes[0] = new PessoaFisica("João", 1000);
        contribuintes[1] = new PessoaFisica("Maria", 2000);
        contribuintes[2] = new PessoaFisica("Pedro", 3000);

        contribuintes[3] = new PessoaJuridica("Empresa A", 5000);
        contribuintes[4] = new PessoaJuridica("Empresa B", 10000);
        contribuintes[5] = new PessoaJuridica("Empresa C", 20000);

        for (Contribuinte c : contribuintes) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("Renda: " + c.getRendaBruta());
            System.out.println("Imposto: " + c.calcularImposto());
            System.out.println("----------------------");
        }
    }

}

