public class B6RecorrerUnaMatriz {
    public static void main(String[] args) {
        String[][] nombres = new String[5][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "María";

        nombres[1][0] = "Pato";
        nombres[1][1] = "Bea";

        nombres[2][0] = "Lucas";
        nombres[2][1] = "Luci";

        nombres[3][0] = "Pan";
        nombres[3][1] = "Pon";

        nombres[4][0] = "Vin";
        nombres[4][1] = "Van";

        for (int i = 0; i < nombres.length; i++){ // Filas (3)
            for (int j = 0; j < nombres[4].length; j++){ // fila[i] (es el largo de la fila i, que es de 2 columnas).
                System.out.println("Nombre = " + nombres[i][j]);
            }
        }
    }
}
