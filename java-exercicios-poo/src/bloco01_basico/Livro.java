package bloco01_basico;

public class Livro {

    String titulo;
    String autor;
    int ano;

    void exibirInfo(){
        System.out.println(titulo + " - " + autor + " (" + ano + ")");

    }

    public static void main(String[] args){
        Livro l = new Livro();
        l.titulo = "Dom Casmurro";
        l.autor = "Machado de Assis";
        l.ano = 1899;
        l.exibirInfo();
    }

}
