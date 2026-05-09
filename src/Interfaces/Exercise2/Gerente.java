package Interfaces.Exercise2;

public class Gerente  extends  Funcionario  implements  Autenticavel{

    private String senha ;

    public Gerente(String senha) {
        this.senha = senha;
    }

    @Override
    double calcularBonus() {
        return salario + (calcularBonus() * 0.20);
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
