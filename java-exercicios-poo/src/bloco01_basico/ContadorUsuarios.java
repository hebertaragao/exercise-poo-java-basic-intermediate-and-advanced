package bloco01_basico;

public class ContadorUsuarios {

    static int totalUsuarios = 0;
    String nome;

    public ContadorUsuarios(String nome){
        this.nome = nome;
        totalUsuarios++;
    }

    public static void main(String[] args){
        new ContadorUsuarios("Ana");
        new ContadorUsuarios("Carlos");
        System.out.println("Usuarios criados: " + ContadorUsuarios.totalUsuarios);
    }

}
