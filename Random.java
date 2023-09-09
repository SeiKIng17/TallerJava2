import java.util.Random;
import java.util.Scanner;

public class Random{
    public static void main(String[] args) {
        // Inicializa un generador de números aleatorios
        java.util.Random random = new java.util.Random();

        // Genera un número aleatorio entre 0 y 100 (inclusive)
        int numeroAleatorio = random.nextInt(101);

        // Inicializa variables
        int numeroIntentos = 0;
        int numeroMin = 0;
        int numeroMax = 100;

        System.out.println("Adivina el número en el que estoy pensando del " + numeroMin + " al " + numeroMax);

        // Crea un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (numeroIntentos < 10) {
            System.out.println("Ingresa un número. Tienes " + (10 - numeroIntentos) + " oportunidades para adivinar:");
            int numeroIngresado = scanner.nextInt();

            if (numeroIngresado < numeroAleatorio) {
                System.out.println("Tu número es mayor.");
            } else if (numeroIngresado > numeroAleatorio) {
                System.out.println("Tu número es menor.");
            } else {
                System.out.println("¡Acertaste el número, FELICITACIONES! El número era " + numeroAleatorio);
                break;
            }

            numeroIntentos++;
        }

        if (numeroIntentos >= 10) {
            System.out.println("Fin del juego. Agotaste tus 10 intentos. El número era " + numeroAleatorio);
        }

        // Cierra el Scanner
        scanner.close();
    }
}
