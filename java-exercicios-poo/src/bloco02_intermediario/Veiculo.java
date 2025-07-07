package bloco02_intermediario;

public abstract class Veiculo {
    protected String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public abstract void mover();

    public void exibirMarca() {
        System.out.println("Marca: " + marca);
    }
}