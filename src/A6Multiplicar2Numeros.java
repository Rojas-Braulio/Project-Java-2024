import java.util.Scanner;

public class A6Multiplicar2Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int resultado = 0;

        for (int i = 0; i < numero2; i++){
            resultado += numero1;
        }

        System.out.println(resultado);
    }
}
