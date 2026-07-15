package Exception;

public class Finally {
    public static void main(String[] args) {
        int[] numeros = {3, 56, 464, 244, 24,  421, 14};
        int[] demon = {2, 3, 4, 0, 2};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (ArithmeticException exceptione) {
                System.out.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException exceptione) {
                System.out.println("Posição do array inválida");
            }
            finally {
                System.out.println("Essa linha é impressa sempre  após try e catch !");
            }
        }
    }
}
