package bloco02_intermediario;

public class Cachorro extends Animal{

    @Override
    public void fazerSom(){
    System.out.println("CAchorro late: Au au");
}

public static void main(String[] args){
    Animal a = new Cachorro();
    a.fazerSom();
}
}

