package Construtores;

public class Funcionario {
    private String nome;
    private double salary;

    public Funcionario(String nome, double salary) {
        this.nome = nome;
        this.salary = salary;

    }

    public void exibirFuncionario() {
        System.out.println("Nome : " + nome);
        System.out.println("Salario : " + salary);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
