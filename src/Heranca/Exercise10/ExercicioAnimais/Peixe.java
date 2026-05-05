package Heranca.Exercise10.ExercicioAnimais;

public class Peixe extends  Animal {
    private String caracteristicas;

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCaracterística: " + caracteristicas;
    }
}
