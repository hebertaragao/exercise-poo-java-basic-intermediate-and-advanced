package bloco01_basico;

public class ConstrutoresMultiplos {
    String nome;
    int idade;

    public ConstrutoresMultiplos(){
        nome = "Desconhecido";
        idade = 0;
}

    public ConstrutoresMultiplos(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void exibir(){
        System.out.println(nome + ", " + idade + " anos");
    }

    public static void main(String[] args){
        ConstrutoresMultiplos p1 = new ConstrutoresMultiplos();
        ConstrutoresMultiplos p2 = new ConstrutoresMultiplos("Hebert", 25);
        p1.exibir();
        p2.exibir();
    }

}
