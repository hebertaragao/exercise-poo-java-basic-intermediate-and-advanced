package bloco02_intermediario;

public class Endereco {

    String rua, cidade;

    public Endereco(String rua, String cidade){
        this.rua = rua;
        this.cidade = cidade;
    }

    public String formatar(){
        return rua + ", " + cidade;
    }
}

