package Arrays;

public class Temperatura {
    public static void main(String[] args) {
        double TempDia001 =31.3 ;
        double TempDia002 =33.3 ;
        double TempDia003 =33.3 ;
        double TempDia004 =36.3 ;
        double TempDia005 =38.8 ;
        double TempDia006 =38.3 ;

        double [] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 33.3;
        temperaturas[2] = 33.3;
        temperaturas[3] = 36.3;
        temperaturas[4] = 38.6;
        temperaturas[5] = 38.3;
        System.out.println("O valor da temperatura do dia 1 é : " + temperaturas[0]);


    }
}
