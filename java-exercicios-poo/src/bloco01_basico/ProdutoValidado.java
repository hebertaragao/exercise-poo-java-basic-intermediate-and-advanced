package bloco01_basico;

public class ProdutoValidado {

    String nome;
    double preco;

    public ProdutoValidado(String nome, double preco){
        this.nome = nome;
        this.preco = preco > 0? preco : 1.0;
    }

    public void exibir(){
        System.out.println("Produto: " + nome + " Preço: R$ " + preco);
    }

    public static void main(String[] args){
        ProdutoValidado p = new ProdutoValidado("Teclado", -20);
        p.exibir();
    }

}
