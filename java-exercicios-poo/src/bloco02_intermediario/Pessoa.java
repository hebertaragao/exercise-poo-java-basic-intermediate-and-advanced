package bloco02_intermediario;

public class Pessoa {
    String nome;
    Endereco endereco;

    public Pessoa(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibir(){
        System.out.println(nome + " mora em " + endereco.formatar());
    }

    public static void main(String[]args){
        Endereco e = new Endereco("Rua das Flores", "Recife");
        Pessoa p = new Pessoa("Hebert", e);
        p.exibir();
    }

}
