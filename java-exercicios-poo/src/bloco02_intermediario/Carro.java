package bloco02_intermediario;

public class Carro extends Veiculo {
    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("Carro está se movendo.");
    }
}