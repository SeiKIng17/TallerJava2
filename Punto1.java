import java.util.Scanner;
public class Punto1 {
    public static void Punto1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la fila actual del caballo (1-8): ");
        int filaCaballo = scanner.nextInt();
        System.out.print("Ingresa la columna actual del caballo (1-8): ");
        int columnaCaballo = scanner.nextInt();
        if (filaCaballo < 1 || filaCaballo > 8 || columnaCaballo < 1 || columnaCaballo > 8) {
            System.out.println("Posicion fuera de rango, recuerda que debe estar entre 1 y 8.");
        } else {
            int[] movimientosFilas = {2, 2, -2, -2, 1, 1, -1, -1};
            int[] movimientosColumnas = {1, -1, 1, -1, 2, -2, 2, -2};
            System.out.println("Posibles movimientos del caballo desde (" + filaCaballo + ", " + columnaCaballo + "):");
            for (int i = 0; i < 8; i++) {
                int nuevaFila = filaCaballo + movimientosFilas[i];
                int nuevaColumna = columnaCaballo + movimientosColumnas[i];

                if (nuevaFila >= 1 && nuevaFila <= 8 && nuevaColumna >= 1 && nuevaColumna <= 8) {
                    System.out.println("(" + nuevaFila + ", " + nuevaColumna + ")");
                }
            }
        }
    }
}

