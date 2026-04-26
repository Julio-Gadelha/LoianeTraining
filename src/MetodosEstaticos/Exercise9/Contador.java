package MetodosEstaticos.Exercise9;

public class Contador {
    private static int count;

    public static void incrementar (){
        count ++;
    }

    public static void zerar(){
        count = 0;
    }

    public static int obterValor(){
        return count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Contador.count = count;
    }
}
