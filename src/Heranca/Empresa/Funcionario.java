package Heranca.Empresa;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        double salario = getSalario();
        return salario + (salario * 0.10);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nSalário: " + salario +
                "\nBônus: " + calcularBonus();
    }
}
