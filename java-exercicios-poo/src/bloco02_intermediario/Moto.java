package bloco02_intermediario;

public class Moto extends Veiculo{
    String modelo;

    public Moto(String marca, String modelo){
        super(marca);
        this.modelo = modelo;
    }

    public void exibir(){
        System.out.println("Marca: " + marca + ", modelo: " + modelo);
    }

    public static void main(String[] args){
        Moto m = new Moto("Yamaha", "Factor 150");
        m.exibir();
    }

}
