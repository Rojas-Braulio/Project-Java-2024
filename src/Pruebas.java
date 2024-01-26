
public class Pruebas {
    public static void main(String[] args) {
        // COMPARAR PALABRAS Y ORDENARLAS ALFABÉTICAMENTE ((( EFICIÉNTEMENTE )))
        String[] productos = {"xotebook", "dilla", "mesa", "algo", "otracosa"};
        int total = productos.length;
        int contador = 0;

        for (int i = 0; i < total; i++){
            for (int j = 0; j < total-1-i; j++){
                if (productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println(contador);




    }
}
