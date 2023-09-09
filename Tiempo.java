import java.util.Scanner;
public class Tiempo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tiempoTotalMinutos = 1;
        int suma = 0;

        while (tiempoTotalMinutos != 0) {
            System.out.print("Ingresa el tiempo del viaje o ingresa 0 para terminar: ");
            tiempoTotalMinutos = input.nextInt();

            if (tiempoTotalMinutos >= 0) {
                suma += tiempoTotalMinutos;
            }

            int horas = suma / 60;
            int minutos = suma % 60;

            System.out.println("El tiempo total del viaje es: " + horas + " horas " + minutos + " minutos");
        }

        input.close();
    }
}

