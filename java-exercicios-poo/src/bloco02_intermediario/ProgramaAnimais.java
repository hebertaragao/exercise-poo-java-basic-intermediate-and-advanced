package bloco02_intermediario;

public class ProgramaAnimais {

    public static void main(String[] args){
        Animal[] animais = {new Cachorro(), new Gato(), new Animal()};

        for (Animal a :  animais){
            a.fazerSom();
        }
    }

}
