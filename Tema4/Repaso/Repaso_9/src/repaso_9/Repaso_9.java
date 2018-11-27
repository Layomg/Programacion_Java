package repaso_9;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;

public class Repaso_9 {

    public static Date ObtenerFecha() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = entrada.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = entrada.nextInt();
        System.out.print("Ingrese el año: ");
        int año = entrada.nextInt();
        Date fecha = new Date(año-1900, mes-1, dia);
        return fecha;
    }
    
    public static void MostrarFecha(Date fecha) {
        DateFormat sencillo = DateFormat.getDateInstance(DateFormat.FULL);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, 100);
        Date fecha_nueva = calendar.getTime();
        System.out.println(sencillo.format(fecha_nueva));
    }
    
    public static void main(String[] args) {
        Date fecha = ObtenerFecha();
        MostrarFecha(fecha);
    }
    
}
