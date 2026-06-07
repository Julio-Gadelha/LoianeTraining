package Interfaces.ReinoAnimal;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }

    private String raca;

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirsom() {

    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
