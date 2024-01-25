import java.util.Scanner;

public class A10OrdenarArregloForma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, arreglo[];
        arreglo = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(arreglo[9 - i]);
            System.out.println(arreglo[i]);
        }
    }
}
