//Crea un programa que simule un juego de adivinanzas.
//El programa debe generar un número aleatorio entre 0 y 100,
// y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos
// . En cada intento, el programa debe informar si el número ingresado
// por el usuario es mayor o menor que el número generado.
//Consejos:
//
//Para generar un número aleatorio en Java: new Random().nextInt(100);
//
//Utiliza el Scanner para obtener los datos del usuario.
//
//Utiliza una variable para contar los intentos.
//
//Utiliza un bucle para controlar los intentos.
//
//Utiliza la instrucción ‘break;’ para salir del bucle.
//
//¡Buena suerte!

import java.util.Random;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        int numeroSecreto = new Random().nextInt(100);
        int numeroJuegador;
        int intentos=5;
        int opcion=0;

        Scanner teclado = new Scanner(System.in);
        String inicio = """
                **** Bienvenido a Adivina el numero ****
                
                Tendras que adivinar un numero del 1 al 100.
                y tienes 5 intentos.
                
                Buena Suerte."""
                ;
        System.out.println(inicio);
        String menu = """
                \n****Menu****
                Deseas empezar digite 1.

                Si deseas salir digite 2.
                """;


        while (opcion!=2){
        System.out.println(menu);
        opcion = teclado.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Bien ahora digite un numero del 1 al 100");
                        numeroJuegador = teclado.nextInt();
                        intentos --;
                        if (numeroJuegador >100 || numeroJuegador < 1 ){
                            System.out.println("Tu numero no esta permitido vuelve a digitar un numero del 1 al 100.");
                        }else if(numeroJuegador<numeroSecreto ){
                            System.out.println("Tu numero es menor al numero secreto intenta uno mas alto.");

                        }else if(numeroJuegador>numeroSecreto ){
                            System.out.println("Tu numero es mayor que el numero secreto intenta uno mas bajo.");
                        }if(numeroJuegador==numeroSecreto){
                            System.out.println("Felicidades adivinaste el numero secreto en:"+ ((intentos == 1) ? "1 intento." : intentos + " intentos.")+
                         "\n Si deseas salir digite 0.");
                        }
                        System.out.println("Te quedan: "+((intentos == 1) ? "1 intento." : intentos + " intentos."));
                        if (intentos < 1){
                            System.out.println("Te quedaste sin intentos.");
                            break;
                        }
                    break;
                case 2:
                    System.out.println("Cerrando el programa.");
                    break;

            }

        }
    }
}
