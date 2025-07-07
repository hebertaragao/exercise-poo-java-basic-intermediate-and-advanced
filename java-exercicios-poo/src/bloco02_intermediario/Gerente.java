package bloco02_intermediario;

public class Gerente extends Funcionario {
    double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bônus: R$" + bonus);
    }

    public static void main(String[] args) {
        Gerente g = new Gerente("Hebert", 5000, 1500);
        g.exibirDados();
    }
}