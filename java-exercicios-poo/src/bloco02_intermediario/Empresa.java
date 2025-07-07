package bloco02_intermediario;
import java.util.ArrayList;

public class Empresa {
    String nome;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f){
        funcionarios.add(f);
    }

    public void listarFuncionarios(){
        for(Funcionario f : funcionarios){
            f.exibirDados();
        }
    }

    public static void main(String[] args){
        Empresa emp = new Empresa();
        emp.nome = "Tech Solutions";
        emp.adicionarFuncionario(new Funcionario("Alice", 3000));
        emp.adicionarFuncionario(new Funcionario("Bruno", 2800));
        emp.listarFuncionarios();
    }
}
