package tema5_9;

import java.util.Scanner;

public class Tema5_9 {

    public static void ObtenerX(String frase) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese la posición: ");
        int x = entrada.nextInt();
        System.out.println("Posición "+x+": "+frase.charAt(x));
    }
    
    public static void ComprobarE(String frase) {
        if (frase.charAt(0) == 'E')
            System.out.println("El primer carácter es E");
        else
            System.out.println("El primer carácter no es E");
    }
    
    public static void main(String[] args) {
        String frase = "En mi próxima vida, creeré en la reencarnación";
        System.out.println("Longitud: " +frase.length());
        System.out.println("Caracter 7: "+frase.charAt(7));
        String creere = frase.substring(20,26);
        System.out.println(creere);
        ObtenerX(frase);
        System.out.println(frase.toUpperCase());
        ComprobarE(frase);
    }
    
}
