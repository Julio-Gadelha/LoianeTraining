package Interfaces.Exercise3;

public class Piramide extends Figura3D {

    private double altura;
    private  double arestasBase;
    private double apotema;

    private Figura2D base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestasBase() {
        return arestasBase;
    }

    public void setArestasBase(double arestasBase) {
        this.arestasBase = arestasBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }
}
