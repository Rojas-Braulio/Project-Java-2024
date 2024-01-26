import java.util.Scanner;

public class BOrdenarArregloForma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creamos arreglo
        int[] ar = new int[10];
        int[] nuevoArreglo = new int[10];

        //llenar
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        //ordenar
        int contador = 0; // creamos contador para ir sumando sin afectar a los arrays
        for (int i = 0; i < ar.length - i; i++) {

            nuevoArreglo[contador++] = ar[ar.length - 1 - i]; // asignamos los arreglos anteriores al arreglo nuevo para no perder valores
            nuevoArreglo[contador++] = ar[i];

            // NuevoArreglo          ar
            // D-0-0-0-0-0-0-0-0-0   1-2-3-4-5-6-7-8-9-D
            // D-1-0-0-0-0-0-0-0-0   1-2-3-4-5-6-7-8-9-D
            // D-1-9-0-0-0-0-0-0-0   1-2-3-4-5-6-7-8-9-D
            // D-1-9-2-0-0-0-0-0-0   1-2-3-4-5-6-7-8-9-D
            // ...
        }

        for (int a : nuevoArreglo) {
            System.out.println(a);
        }
    }
}
