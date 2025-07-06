package bloco01_basico;

public class Impressora {

    int folhasDisponiveis =5;

    public void imprimir(String documento){
        if(folhasDisponiveis > 0){
            System.out.println("Imprimindo: " + documento);
            folhasDisponiveis--;
        } else{
            System.out.println("Sem papel!");
        }
    }

    public static void main(String[] args){
        Impressora imp = new Impressora();
        imp.imprimir("Contrato");
        imp.imprimir("Relatório");
    }

}
