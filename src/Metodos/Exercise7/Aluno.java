package Metodos.Exercise7;

public class Aluno {
    public String nome;
    public String matricula;
    public String curso;

    public String disciplina1;
    public String disciplina2;
    public String disciplina3;

    public double nota1;
    public double nota2;
    public double nota3;


    public void verificarAprovacao(double nota, String disciplina) {

        if (nota >= 7) {
            System.out.println("Aprovado em " + disciplina);
        } else {
            System.out.println("Reprovado em " + disciplina);
        }
    }
}
