package tema5_3;

import java.util.Scanner;

public class Tema5_3 {

    public static String ObtenerPalabra() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String frase = entrada.nextLine();
        return frase;
    }

    public static void ComprobarPalindromo(String palabra) {
        char palabradesc[] = palabra.toLowerCase().toCharArray();
        int longi = palabradesc.length / 2, contador = 0;
        boolean Palindromo = false;
        for (int i = 0; i < Math.floor(longi); i++) {
            if (palabradesc[i] == palabradesc[(palabradesc.length - (1 + i))]) {
                contador++;
            }
        }
        if (contador == Math.floor(longi)) {
            Palindromo = true;
        }
        if (Palindromo == true) {
            System.out.println("Es palíndromo");
        } else if (Palindromo == false){
            System.out.println("No es palíndromo");
        }
    }

    public static void main(String[] args) {
        String palabra = ObtenerPalabra();
        ComprobarPalindromo(palabra);
    }

}
