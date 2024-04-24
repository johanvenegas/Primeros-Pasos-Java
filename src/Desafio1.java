//Escribe un programa que convierta una temperatura en grados Celsius
// a Fahrenheit. Utiliza variables para representar los valores de las
// temperaturas e imprime en la consola el valor convertido de Celsius a
// Fahrenheit.

//Consejo: La fórmula para convertir temperaturas de grados Celsius a
// Fahrenheit es: (temperatura * 1.8) + 32.

//Después de terminar, probar y verificar que tu programa se
// haya ejecutado correctamente, crea una variable entera para
// mostrar la temperatura en Fahrenheit sin decimales. Recuerda
// que probablemente necesitarás realizar un casting de valores.


public class Desafio1 {
    public static void main(String[] arg){

        double celcius = 37.5;
        double fahrenheit = (celcius * 1.8)+32;
        int fahrenheitEntero= (int) fahrenheit;
        String aviso = String.format("La temperatura en celcius es de : %f y la " +
                "temperatura en Fahrenheit es de : %f",celcius,fahrenheit);
        System.out.println(aviso);
        System.out.println("Temperatura en Fahrenheit: "+fahrenheit);
        System.out.println("Temperatura entero en Fahrenheit: "+fahrenheitEntero);
    }
}

