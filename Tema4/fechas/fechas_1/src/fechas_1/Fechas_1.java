package fechas_1;

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Fechas_1 {

    public static GregorianCalendar ObtenerFechaNcto() { //Función para obtener la fecha de nacimiento
        Scanner entrada = new Scanner (System.in);
        int año, mes, dia;
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Año: ");
        año = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Día: ");
        dia = entrada.nextInt();
        GregorianCalendar fecha_nacimiento = new GregorianCalendar(año,mes-1,dia);
        return fecha_nacimiento;
    }
    
    public static void CalcularEdad(GregorianCalendar fecha_nacimiento) {
        GregorianCalendar fecha_actual = new GregorianCalendar();
        int edad=0;
        if (fecha_nacimiento.compareTo(fecha_actual) == -1) { //Comparo si la fecha actual es más reciente
            if((fecha_actual.get(Calendar.MONTH) == fecha_nacimiento.get(Calendar.MONTH)) && (fecha_actual.get(Calendar.DAY_OF_MONTH) >= fecha_nacimiento.get(Calendar.DAY_OF_MONTH))) { //Compara si el mes actual es mayor al del nacimiento o igual y si el día del mes es
                edad = fecha_actual.get(Calendar.YEAR) - fecha_nacimiento.get(Calendar.YEAR);
            } else if (fecha_actual.get(Calendar.MONTH) > fecha_nacimiento.get(Calendar.MONTH)) {
                edad = fecha_actual.get(Calendar.YEAR) - fecha_nacimiento.get(Calendar.YEAR);
            }
            else {
                edad = fecha_actual.get(Calendar.YEAR) - fecha_nacimiento.get(Calendar.YEAR);
                edad--;
            }
        }
        System.out.println("Edad: "+edad);
    } 
    
    public static void main(String[] args) {
        GregorianCalendar fecha_nacimiento = ObtenerFechaNcto();
        CalcularEdad(fecha_nacimiento);
    }
    
}
