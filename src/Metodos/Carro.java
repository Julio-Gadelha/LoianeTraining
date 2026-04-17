package Metodos;

public class Carro {
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCobustivel;

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + capCombustivel * consumoCobustivel + "Km");
    }

    public double obterAutonomia(){
        System.out.println("Metodo obter autonomia foi chamado : ");
      return capCombustivel * consumoCobustivel;
    }

    public double calcularCombustivel(double km){
        double qtdcombustivel = km / consumoCobustivel;
        return qtdcombustivel;
    }

}
