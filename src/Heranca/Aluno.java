package Heranca;

public class Aluno extends Pessoa {

    private String cursos;
    private double [] notas;

    public Aluno(String nome, String endereco, String telefone, String cpf, String cursos, double[] notas) {
        super(nome, endereco, telefone, cpf);
        this.cursos = cursos;
        this.notas = notas;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovacao(){
        return true;
    }
}
