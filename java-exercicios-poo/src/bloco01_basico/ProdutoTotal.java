package bloco01_basico;

public class ProdutoTotal {
    String nome;
    double preco;
    int quantidade;

    double calcularTotal(){
        return preco * quantidade;
    }

    public static void main(String[] args){
        ProdutoTotal p = new ProdutoTotal();
        p.nome = "Mouse";
        p.preco = 50.0;
        p.quantidade = 3;
        System.out.println("Total> R$ " + p.calcularTotal());
    }

}
