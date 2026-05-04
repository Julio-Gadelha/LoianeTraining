package Heranca.Empresa;

public class TestEmpresa {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", 2000);
        Gerente g = new Gerente("Maria", 5000, "TI");


        System.out.println(f);
        System.out.println("--------------");
        System.out.println(g);
        System.out.println("----------------");
        System.out.println("Bônus Funcionário: " + f.calcularBonus());
        System.out.println("Bônus Gerente: " + g.calcularBonus());

    }
}
