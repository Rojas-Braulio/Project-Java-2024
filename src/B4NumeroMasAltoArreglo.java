import java.util.Random;

public class B4NumeroMasAltoArreglo {
    public static void main(String[] args) {
        int[] array = new int[7];
        Random random = new Random();
        int alength = array.length;
        int max = 0;

        for (int i = 0; i < alength; i++){
            array[i] = random.nextInt(11,99);
        }

        System.out.println("");
        for (int cantidad : array){
            System.out.println(cantidad);
        }

        for (int i = 0; i < alength; i++){
            max = (array[max] > array[i]) ? max: i;
        }
        System.out.println("\nEl valor máximo del arreglo es: " + array[max]);
    }
}
