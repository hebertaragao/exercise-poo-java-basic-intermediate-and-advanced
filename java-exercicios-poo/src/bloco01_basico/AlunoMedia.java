package bloco01_basico;

public class AlunoMedia {

    String nome;
    double nota1, nota2;

    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    public void verificarAprovacao(){
        double media = calcularMedia();
        System.out.println("Média: " + media);
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado!"); 
    }

    public static void main(String[] args){
        AlunoMedia a = new AlunoMedia();
        a.nome = "Hebert Aragão";
        a.nota1 = 8.0;
        a.nota2 = 6.5;
        a.verificarAprovacao();
        }
}
