package fechas_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fechas_2 {

    public static void ComprobarDiasVerano() {
        GregorianCalendar fecha_actual = new GregorianCalendar();
        GregorianCalendar fecha_verano = new GregorianCalendar(fecha_actual.get(Calendar.YEAR), Calendar.JUNE, 22);
        int diashastaverano = 0;
        if (fecha_actual.get(Calendar.DAY_OF_YEAR) > fecha_verano.get(Calendar.DAY_OF_YEAR)) {
            fecha_verano.add(Calendar.YEAR, 1);
            diashastaverano = (365 - (fecha_actual.get(Calendar.DAY_OF_YEAR)) + fecha_verano.get(Calendar.DAY_OF_YEAR));
        } else if (fecha_actual.get(Calendar.DAY_OF_YEAR) <= fecha_verano.get(Calendar.DAY_OF_YEAR)) {
            diashastaverano = fecha_verano.get(Calendar.DAY_OF_YEAR) - fecha_actual.get(Calendar.DAY_OF_YEAR);
        }
        System.out.println("Días hasta verano: " + diashastaverano);
    }

    public static void main(String[] args) {
        ComprobarDiasVerano();
    }

}
