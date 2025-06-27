package bloco01_basico;
public class Pessoa {

    String nome;
    int idade;

    void exibirDados(){
        System.out.println("Nome: "  + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args){
        Pessoa p = new Pessoa();
        p.nome = "Hebert Aragão";
        p.idade = 49;
        p.exibirDados();
    }

}
