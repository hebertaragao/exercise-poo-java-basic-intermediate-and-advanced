package bloco02_intermediario;

public class Circulo {
    double raio;

    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    public double calcularCircunsferencia(){
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args){
        Circulo c = new Circulo();
        c.raio = 5;
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Circunsferência: " + c.calcularCircunsferencia());
    }

}
