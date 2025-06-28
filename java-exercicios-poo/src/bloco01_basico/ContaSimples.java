package bloco01_basico;

public class ContaSimples {

    double saldo;

    void depositar(double valor){
        saldo += valor;
    }

    void sacar(double valor){
        if (valor <= saldo) saldo -= valor;
        else System.out.println("Saldo insuficiente.");
    }

    public static void main(String[] args){
        ContaSimples c = new ContaSimples();
        c.depositar(100);
        c.sacar(30);
        System.out.println("Salfo final: R$ " + c.saldo);
    }

}
