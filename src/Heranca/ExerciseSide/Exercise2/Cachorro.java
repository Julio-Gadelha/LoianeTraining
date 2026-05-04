package Heranca.ExerciseSide.Exercise2;

public class Cachorro extends Animal {


    @Override
    public void fazerSom() {
        System.out.println("Latido ");
    }
    public void mostrarNome() {

        System.out.println("Nome: " + nome);
    }
}
