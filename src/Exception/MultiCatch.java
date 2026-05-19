package Exception;

public class MultiCatch {
    public static void main(String[] args) {
        int[] numeros = {3, 56, 464, 242, 757, 24, 2567, 421, 14};
        int[] demon = {2, 3, 5, 0, 2};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (ArithmeticException exceptione) {
                System.out.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválida");
            }
            finally {
                System.out.println("Essa linha é impressa sempre  após try e catch");
            }
        }
    }

}
