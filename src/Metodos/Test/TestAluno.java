package Metodos.Test;

import Metodos.Exercise7.Aluno;

import java.util.Scanner;

public class TestAluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();

        System.out.print("Matricula: ");
        aluno.matricula = sc.nextLine();

        System.out.print("Curso: ");
        aluno.curso = sc.nextLine();

        System.out.print("Disciplina 1: ");
        aluno.disciplina1 = sc.nextLine();

        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Disciplina 2: ");
        aluno.disciplina2 = sc.nextLine();

        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Disciplina 3: ");
        aluno.disciplina3 = sc.nextLine();

        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println("\nResultado:");

        aluno.verificarAprovacao(aluno.nota1, aluno.disciplina1);
        aluno.verificarAprovacao(aluno.nota2, aluno.disciplina2);
        aluno.verificarAprovacao(aluno.nota3, aluno.disciplina3);

        sc.close();
    }
}
