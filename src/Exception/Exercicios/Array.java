package Exception.Exercicios;

public class Array {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};
        System.out.println("Vou acessar a posição 5...");

        try{
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Posição 5 ja foi tratada!");
        }
        System.out.println("Attencion , erro trated with sucess");
    }
}
