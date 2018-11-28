package tema5_7;

import java.util.Scanner;

public class Tema5_7 {

    public static String ObtenerNIF() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese un NIF :");
        String NIF = entrada.next();
        return NIF;
    }
    
    public static void ComprobarNIF(String NIF) {
        int contador=0;
        for (int i = 0; i < 8;i++) {
            if (Character.isDigit(NIF.charAt(i)))
                contador++;
        }
        if (Character.isAlphabetic(NIF.charAt(8)) && (contador == 8)) {
            if (Character.isUpperCase(NIF.charAt(8))) {
                for (int i = 0; i < 8; i++) {
                System.out.print(NIF.charAt(i));
                }
            }
        }
        else {
            System.out.println("NIF incorrecto");
        }
    }
    
    public static void main(String[] args) {
        String NIF = ObtenerNIF();
        ComprobarNIF(NIF);
    }
    
}
