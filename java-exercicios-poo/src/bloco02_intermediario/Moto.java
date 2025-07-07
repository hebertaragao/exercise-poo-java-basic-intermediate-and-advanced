package bloco02_intermediario;

public class Moto extends Veiculo {
    String modelo;

    public Moto(String marca, String modelo) {
        super(marca);
        this.modelo = modelo;
    }

    @Override
    public void mover() {
        System.out.println("Moto acelerando...");
    }

    public void exibir() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }

    public static void main(String[] args) {
        Veiculo v1 = new Carro("Chevrolet");
        Veiculo v2 = new Bicicleta("Caloi");
        Moto m = new Moto("Yamaha", "Factor 150");

        System.out.println("--- Carro ---");
        v1.exibirMarca();
        v1.mover();

        System.out.println("\n--- Bicicleta ---");
        v2.exibirMarca();
        v2.mover();

        System.out.println("\n--- Moto ---");
        m.exibir();
        m.mover();
    }
}