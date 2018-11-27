package fechas_4;

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Fechas_4 {

    public static void EdadEnSemanas() {
        Scanner entrada = new Scanner(System.in);
        int edad_en_semanas = 0, edad;
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Ingrese el día: ");
        int dia = entrada.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = entrada.nextInt();
        System.out.print("Ingrese el año: ");
        int año = entrada.nextInt();
        GregorianCalendar fecha_nacimiento = new GregorianCalendar(año, mes - 1, dia);
        GregorianCalendar fecha_actual = new GregorianCalendar();
        if (fecha_nacimiento.compareTo(fecha_actual) == -1) {
            if (fecha_nacimiento.get(Calendar.YEAR) == fecha_actual.get(Calendar.YEAR)) {
                edad_en_semanas = fecha_actual.get(Calendar.WEEK_OF_YEAR) - fecha_nacimiento.get(Calendar.WEEK_OF_YEAR);
            } else if (fecha_nacimiento.get(Calendar.WEEK_OF_YEAR) < fecha_actual.get(Calendar.WEEK_OF_YEAR)) {
                edad = fecha_actual.get(Calendar.YEAR) - fecha_nacimiento.get(Calendar.YEAR);
                edad = edad * 52;
                edad_en_semanas = (fecha_actual.get(Calendar.WEEK_OF_YEAR) - fecha_nacimiento.get(Calendar.WEEK_OF_YEAR)) + edad;
            } else if (fecha_nacimiento.get(Calendar.WEEK_OF_YEAR) > fecha_actual.get(Calendar.WEEK_OF_YEAR)) {
                edad = fecha_actual.get(Calendar.YEAR) - fecha_nacimiento.get(Calendar.YEAR);
                edad = edad * 52;
                edad_en_semanas = edad - (fecha_nacimiento.get(Calendar.WEEK_OF_YEAR) - fecha_actual.get(Calendar.WEEK_OF_YEAR));
            }
        }
        System.out.println("Edad en semanas: " + edad_en_semanas);
    }

    public static GregorianCalendar PedirFecha() { //Función para pedir una fecha y devolverla
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una fecha");
        System.out.print("Ingrese el día: ");
        int dia = entrada.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = entrada.nextInt();
        System.out.print("Ingrese el año: ");
        int año = entrada.nextInt();
        GregorianCalendar fecha = new GregorianCalendar(año, mes - 1, dia);
        return fecha;
    }

    public static void DecirEstacion(GregorianCalendar fecha) { //Método para comprobar la estación del año
        if (((fecha.get(Calendar.MONTH) == 2) && (fecha.get(Calendar.DAY_OF_MONTH) > 20)) || ((fecha.get(Calendar.MONTH) == 5) && (fecha.get(Calendar.DAY_OF_MONTH) <= 21)) || ((fecha.get(Calendar.MONTH) > 2) && (fecha.get(Calendar.MONTH) < 5))) {
            System.out.println("Primavera");
        }
        if ((fecha.get(Calendar.MONTH) == 5) && (fecha.get(Calendar.DAY_OF_MONTH) >= 22) || (fecha.get(Calendar.MONTH) == 8 && fecha.get(Calendar.DAY_OF_MONTH) <= 24) || (fecha.get(Calendar.MONTH) > 5) && (fecha.get(Calendar.MONTH) < 9)) {
            System.out.println("Verano");
        }
        if (((fecha.get(Calendar.MONTH) == 8) && fecha.get(Calendar.DAY_OF_MONTH) > 24) || ((fecha.get(Calendar.MONTH) == 11) && (fecha.get(Calendar.DAY_OF_MONTH) <= 22)) || (fecha.get(Calendar.MONTH) > 8) && (fecha.get(Calendar.MONTH) < 11)) {
            System.out.println("Otoño");
        }
        if (((fecha.get(Calendar.MONTH) == 11) && (fecha.get(Calendar.DAY_OF_MONTH) > 22)) || (fecha.get(Calendar.MONTH) == 2) && (fecha.get(Calendar.DAY_OF_MONTH) < 22) || fecha.get(Calendar.MONTH) < 2) {
            System.out.println("Invierno");
        }
    }

    public static void MostrarFechas(GregorianCalendar fecha1, GregorianCalendar fecha2) {
        int dias = 0;
        do {
            dias++;
            fecha1.add(Calendar.DAY_OF_MONTH , 1);
        } while (!(fecha1.equals(fecha2)));
        System.out.println("Hay "+dias+" días entre las dos fechas");
    }

    public static void mostrarcantDomingos(GregorianCalendar fecha1, GregorianCalendar fecha2) {
        int domingos = 0;
        do {
            if (fecha1.get(Calendar.DAY_OF_WEEK) == 7) {
                domingos++;
            }
            fecha1.add(Calendar.DAY_OF_MONTH, 1);
        } while (!(fecha1.equals(fecha2)));
        System.out.println("Hay "+domingos+" domingos");
    }

    public static void main(String[] args) {
        EdadEnSemanas();
        GregorianCalendar fecha1 = PedirFecha();
        System.out.println("Mostrar estación");
        DecirEstacion(fecha1);
        System.out.println("Mostrar número de días entre dos fechas");
        GregorianCalendar fecha2, fecha3;
        do {                                                 
            fecha2 = PedirFecha();
            fecha3 = PedirFecha();
            if (fecha2.compareTo(fecha3) != -1)
                System.out.println("Error, la primera fecha es mayor a la segunda");
        } while (fecha2.compareTo(fecha3) != -1);
        MostrarFechas(fecha2, fecha3);
        System.out.println("Mostrar cantidad de domingos");
        GregorianCalendar fecha4, fecha5;
        do {                 
            fecha4 = PedirFecha();
            fecha5 = PedirFecha();
            if (fecha2.compareTo(fecha3) != -1) 
                System.out.println("Error, la primera fecha es mayor a la segunda");
        } while (fecha4.compareTo(fecha5) != -1);
        mostrarcantDomingos(fecha4, fecha5);
    }

}
