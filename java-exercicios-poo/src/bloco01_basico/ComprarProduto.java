package bloco01_basico;

public class ComprarProduto {

    String nome;
    double preco;

    public boolean temMesmoPreco(ComprarProduto outro){
        return this.preco == outro.preco;
    }
    public static void main(String[] args){
        ComprarProduto p1 = new ComprarProduto();
        p1.nome = "Caneta";
        p1.preco = 2.5;

        ComprarProduto p2 = new ComprarProduto();
        p2.nome = "Lápis";
        p2.preco = 2.5;

        System.out.println(p1.temMesmoPreco(p2));
    }

}
