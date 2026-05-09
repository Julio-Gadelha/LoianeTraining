package Interfaces.Exercise2;

public class Funcionario {
    private String nome;
    double salario;

    double calcularBonus() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
