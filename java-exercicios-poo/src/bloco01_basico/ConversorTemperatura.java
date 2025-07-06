package bloco01_basico;

public class ConversorTemperatura {
    public double celsiusParaFarenheit(double c){
        return (c * 9/5) + 32;
    }

    public double farenheitParaCelisius(double f){
        return (f - 32) * 5/9;
    }

    public static void main(String[] args){
        ConversorTemperatura conv = new ConversorTemperatura();
        System.out.println("25ºC = " + conv.celsiusParaFarenheit(25) + "ºF");
        System.out.println("77ºF = " + conv.farenheitParaCelisius(77) + "ºC");

    }

}
