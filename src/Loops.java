import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        //loop o ciclo desde 0 a 2 se seguira ejecutando el ciclo hasta que
        // el iterador (i) llegue a ser 2 ya que es menor que 3.

        for (int i = 0; i < 3; i++) {
            System.out.println("Describe la nota que le darias a la pelicula Matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
            System.out.println(i);
        }

        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones / 3);
    }
}
