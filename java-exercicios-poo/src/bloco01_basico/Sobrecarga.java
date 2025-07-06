package bloco01_basico;

public class Sobrecarga {
    int somar(int a, int b) {
        return a + b;
    }   

    double somar(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        Sobrecarga s = new Sobrecarga();
        System.out.println(s.somar(5,3));
        System.out.println(s.somar(2.5, 4.7));
    }

}
