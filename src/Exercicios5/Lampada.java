package Exercicios5;

public class Lampada {
    public String modelo;
    public String tensao;
    public int potencia;
    public String cor;
    public String tipoLuz;
    public int garantiaMeses;
    public String[] tipos;
    public Boolean abajur;
    public Boolean ligada;
  ;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
     public void mostrarEstadoDaLampada(){
      if(ligada ){
          System.out.println("Lampada está  ligada");
      } else {
          System.out.println("Lampada está  desligada " );
      }
  }


}
