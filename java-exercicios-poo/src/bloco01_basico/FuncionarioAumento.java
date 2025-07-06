package bloco01_basico;

public class FuncionarioAumento {

    String nome;
    double salario;

    public void aplicarAumento(double percentual){
        salario += salario * percentual / 100;
    }

    public void exibirSalario(){
        System.out.println("Salário atualizado: R$ " + salario);
    }

    public static void main(String[] args){
        FuncionarioAumento f = new FuncionarioAumento();
        f.nome = "Hebert Aragão";
        f.salario = 2000;
        f.aplicarAumento(10);
        f.exibirSalario();
    }

}
