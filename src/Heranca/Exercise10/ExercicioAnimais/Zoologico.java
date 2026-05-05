package Heranca.Exercise10.ExercicioAnimais;


public class Zoologico {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        System.out.println("Zoo : ");
        mamifero.setNome("Camelo");
        mamifero.setComprimento(4.30);
        mamifero.setPatas(4);
        mamifero.setCor("Amerelo");
        mamifero.setAmbiente("Deserto");
        mamifero.setVelocidade(20.3);
        System.out.println(mamifero.toString());

        Peixe peixe = new Peixe();
        peixe.setNome("Tuburão");
        peixe.setComprimento(5.0);
        peixe.setPatas(0);
        peixe.setCor("azul");
        peixe.setAmbiente("Mar ");
        peixe.setVelocidade(30.4);
        peixe.setCaracteristicas(" Barbatanas e caudas");
        System.out.println(peixe.toString());

        Mamifero mamifero2 = new Mamifero();
        mamifero2.setNome("Urso-do-canada");
        mamifero2.setComprimento(4.0);
        mamifero2.setPatas(4);
        mamifero2.setCor("Vermelho");
        mamifero2.setAmbiente("Terra");
        mamifero2.setVelocidade(10.3);
        mamifero2.setAlimento("Mel");
        System.out.println(mamifero2.toString());


    }
}
