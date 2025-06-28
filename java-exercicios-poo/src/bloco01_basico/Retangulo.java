package bloco01_basico;

public class Retangulo {

    double largura;
    double altura;

    double calcularArea(){
        return largura * altura;
    }

    double calcularPerimetro(){
        return 2 * (largura + altura);
    }

    public static void main(String[] args){
        Retangulo r = new Retangulo();
        r.largura = 5;
        r.altura = 3;
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }

}
