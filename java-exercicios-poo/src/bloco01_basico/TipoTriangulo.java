package bloco01_basico;

public class TipoTriangulo {

    public String tipoTriangulo(int a, int b, int c){
        if (a == b && b == c) return "Equilátero";
        else if ( a == b || b == c || a == c) return "Isósceles";
        else return "Escaleno";
    }

    public static void main(String[] args){
        TipoTriangulo t = new TipoTriangulo();
        System.out.println(t.tipoTriangulo(3, 3, 3)); // Equilátero
        System.out.println(t.tipoTriangulo(3, 4, 3)); // Isósceles
        System.out.println(t.tipoTriangulo(3, 4, 5)); //Escalaneo

    }

}
