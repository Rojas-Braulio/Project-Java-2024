import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A8CalcularEdad {
    public static void main(String[] args) {

        int anio = 0;
        int mes = 0;
        int dia = 0;
        int anioActual = 0;
        int mesActual = 0;
        int diaActual = 0;

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();
        SimpleDateFormat fechaActual2 = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActualFormat = fechaActual2.format(fechaActual);

        System.out.println("Ingrese su fecha de nacimiento de la siguiente manera Año-Mes-Día (Ej: \"1999-09-09\"): ");
        try {
            String fecha = format.format(format.parse(scanner.next()));
            String[] fechaFormatLista = fecha.split("-");
            for (int i = 0; i < fecha.length(); i++){
                anio = Integer.parseInt(fechaFormatLista[0]);
                mes = Integer.parseInt(fechaFormatLista[1]);
                dia = Integer.parseInt(fechaFormatLista[2]);
            }

            String[] fechaActualLista = fechaActualFormat.split("-");
            for (int i = 0; i < fechaActualFormat.length(); i++){
                anioActual = Integer.parseInt(fechaActualLista[0]);
                mesActual = Integer.parseInt(fechaActualLista[1]);
                diaActual = Integer.parseInt(fechaActualLista[2]);
            }

            if (mesActual < mes){
                System.out.println("Tienes: \n" + (anioActual - anio -1) + " años.\n" +
                        (mesActual - mes + 12) + " meses y\n" +
                        (diaActual - dia - 1) + " días cumplidos.");

            } else {
                System.out.println("Tienes: \n" + (anioActual - anio) + " años.\n" +
                        (mesActual - mes) + "meses y\n" +
                        (diaActual - dia) + "días cumplidos.");
            }

        } catch (ParseException e){
            e.printStackTrace();
        }

    }
}
