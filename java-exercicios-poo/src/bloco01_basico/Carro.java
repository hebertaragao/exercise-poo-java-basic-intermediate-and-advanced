package bloco01_basico;

public class Carro {

    String marca;
    String modelo;
    int ano;

    void exibirDados(){
        System.out.println(marca + " " + modelo + " " + ano);
    }

    public static void main(String[] args){
        Carro c = new Carro();
        c.marca = "Toyota";
        c.modelo = "Corolla";
        c.ano = 2021;
        c.exibirDados();
    }

}
