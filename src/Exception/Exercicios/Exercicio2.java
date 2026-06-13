package Exception.Exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        String texto = "abc";
        System.out.println("Vou converter o texto...");

        try{
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e ) {
            System.out.printf("⚠️  Erro capturado: %s%n", e.getMessage());
        }
        System.out.println("Attencion , erro trated with sucess");
    }
}
