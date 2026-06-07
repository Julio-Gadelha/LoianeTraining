package Interfaces.ReinoAnimal;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado {


    @Override
    public void levarPassear() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirsom() {

    }

    private int tamanho;
    private String raca;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }
}
