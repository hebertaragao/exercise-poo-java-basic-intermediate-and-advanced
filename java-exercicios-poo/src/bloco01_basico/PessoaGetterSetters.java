package bloco01_basico;

public class PessoaGetterSetters {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }

    public static void main(String[] args) {
        PessoaGetterSetters p = new PessoaGetterSetters();
        p.setNome("Hebert Aragão.");
        p.setIdade(49);
        p.exibir();
    }
}
