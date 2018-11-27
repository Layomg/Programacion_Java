package fechas_3;

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Fechas_3 {

    public static GregorianCalendar ObtenerFecha() {
        Scanner entrada = new Scanner(System.in);
        boolean fecha_correcta;
        int dia, mes, año;
        System.out.println("Ingrese una fecha ");
        do {
            System.out.print("Ingrese un día: ");
            dia = entrada.nextInt();
            System.out.print("Ingrese un mes: ");
            mes = entrada.nextInt();
            System.out.print("Ingrese un año: ");
            año = entrada.nextInt();
            fecha_correcta = ComprobarFecha(dia, mes, año);
        } while (fecha_correcta == false); //El bucle continúa si no es correcto al comprobar la fecha
        GregorianCalendar fecha_validada = new GregorianCalendar(año, mes - 1, dia);
        return fecha_validada;
    }

    public static boolean ComprobarFecha(int dia, int mes, int año) { //Función para comprobar si la fecha introducida es correcta
        GregorianCalendar fecha_actual = new GregorianCalendar();
        boolean bisiesto;
        boolean fecha_correcta = false;
        if ((año % 100 == 0) && (año % 400 == 0)) { //Calcula si el año actual es bisiesto
            bisiesto = true;
        } else {
            bisiesto = false;
        }
        if (año <= fecha_actual.get(Calendar.YEAR)) {
            if (mes > 0 && mes < 13) {
                if (mes == 2) { //Mes de febrero
                    if (bisiesto = true) { //Si es bisiesto tiene 29 días
                        if (dia > 0 && dia <= 29) {
                            fecha_correcta = true;
                        } else {
                            fecha_correcta = false;
                            System.out.println("Día incorrecto");
                        }
                    } else if (bisiesto = false) { //Si no es bisiesto tiene 28 días
                        if (dia > 0 && dia <= 28) {
                            fecha_correcta = true;
                        } else {
                            fecha_correcta = false;
                            System.out.println("Día incorrecto");
                        }
                    }
                }
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { //Meses con 30 días
                    if (dia > 0 && dia <= 30) {
                        fecha_correcta = true;
                    } else {
                        fecha_correcta = false;
                        System.out.println("Día incorrecto");
                    }
                }
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) { //Meses con 31 días
                    if (dia > 0 && dia <= 31) {
                        fecha_correcta = true;
                    } else {
                        fecha_correcta = false;
                        System.out.println("Día incorrecto");
                    }
                }
            } else {
                fecha_correcta = false;
                System.out.println("Mes incorrecto");
            }
        } else {
            fecha_correcta = false;
            System.out.println("Año incorrecto");
        }
        return fecha_correcta;
    }

    public static void MostrarDiaSiguiente(GregorianCalendar fecha) {
        GregorianCalendar fecha_dia_siguiente = fecha;
        fecha_dia_siguiente.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Día siguiente: " + fecha_dia_siguiente.get(Calendar.DAY_OF_MONTH));
    }

    public static void MostrarDiaAnterior(GregorianCalendar fecha) {
        GregorianCalendar fecha_dia_anterior = fecha;
        fecha_dia_anterior.add(Calendar.DAY_OF_MONTH, -2);
        System.out.println("Día anterior: " + fecha_dia_anterior.get(Calendar.DAY_OF_MONTH));
    }

    public static void main(String[] args) {
        GregorianCalendar fecha = ObtenerFecha();
        MostrarDiaSiguiente(fecha);
        MostrarDiaAnterior(fecha);
    }

}
