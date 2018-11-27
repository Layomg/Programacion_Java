package repaso_6;

import java.util.Scanner;

public class Repaso_6 {

    public static String ObtenerCadena() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = entrada.nextLine();
        return cadena;
    }
    
    public static void main(String[] args) {
        String cadena = ObtenerCadena();                        //Función para obtener la cadena
        String cadena_reformada = cadena.replaceAll("ny", "ñ"); //Función que sustituye las ny por ñ en una nueva cadena
        System.out.println(cadena_reformada);                   //Muestro la cadena sustituida
    }
    
}
