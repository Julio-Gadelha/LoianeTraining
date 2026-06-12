package Exception;

public class ExceptionGenerica {
    public static void main(String[] args) {

        int[] numeros = {3, 56, 464, 244, 24,  421, 14};
        int[] demon = {2, 3, 4, 0, 2};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
