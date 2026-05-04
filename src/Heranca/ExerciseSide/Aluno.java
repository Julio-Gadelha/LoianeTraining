package Heranca.ExerciseSide;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Hi,my name is " + getNome() + ",  i have  " + getIdade() + " years  is my number of   matricula is " + getMatricula();
    }
}
