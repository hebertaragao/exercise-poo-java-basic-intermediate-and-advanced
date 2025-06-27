package bloco01_basico;

public class PessoaConstrutor {
    String nome;
    int idade;

    public PessoaConstrutor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void exibirDados(){
        System.out.println(nome + " tem " + idade + " anos.");
    }

    public static void main(String[] args){
        PessoaConstrutor p = new PessoaConstrutor("Hebert Aragão", 49);
        p.exibirDados();
    }

}
