package Exception;

public class Excecao {
    public static void main(String[] args) {
        try{
            int[] vetor = new int[4];
            System.out.println("Antes da exception");

            vetor[4] = 1;
            System.out.println("Esse numero não será impresso !");
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Essa exceção ira acessar o indice do veto que não existe");
        }
        System.out.println("Esse texto sera impresso !");
    }
}
