//Desafio numero 1.
public class ConversionDeTemperaturas {
    public static void main(String[] arg){

        double celcius = 37.5;
        double fahrenheit = (celcius * 1.8)+32;
        int fahrenheitEntero= (int) fahrenheit;
        String aviso = String.format("La temperatura en celcius es de : %f y la temperatura en Fahrenheit es de : %f",celcius,fahrenheit);
        System.out.println(aviso);
        System.out.println("Temperatura en Fahrenheit: "+fahrenheit);
        System.out.println("Temperatura entero en Fahrenheit: "+fahrenheitEntero);
    }
}

