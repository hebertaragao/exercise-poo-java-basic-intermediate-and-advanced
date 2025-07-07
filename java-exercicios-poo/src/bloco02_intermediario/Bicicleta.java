package bloco02_intermediario;

public class Bicicleta extends Veiculo {
    public Bicicleta(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println("Bicicleta pedalando...");
    }
}