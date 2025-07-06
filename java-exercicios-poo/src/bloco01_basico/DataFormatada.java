package bloco01_basico;

public class DataFormatada {

    int dia, mes, ano;

    void exibirData(){
        System.out.printf("%02d/%02d/%04d\n", dia, mes, ano);
    }

    public static void main(String[] args){
        DataFormatada d = new DataFormatada();
        d.dia = 27;
        d.mes = 6;
        d.ano = 2025;
        d.exibirData();
    }

}
