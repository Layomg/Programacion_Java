package tema5_6;

import java.util.Scanner;

public class Tema5_6 {

    public static String ObtenerCadena() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        return frase;
    }
    
    public static void ContarAa(String cadena) {
        int posicion, contadorA=0, contadora=0;
        posicion = cadena.indexOf("A");
        while (posicion != -1) {
            contadorA++;
            posicion = cadena.indexOf("A",posicion+1);
        }
        System.out.println("Hay "+contadorA+" letras A");
        posicion = cadena.indexOf("a");
        while (posicion != -1) {
            contadora++;
            posicion = cadena.indexOf("a",posicion+1);
        }
        System.out.println("Hay "+contadora+" letras a");
    }
    
    public static void main(String[] args) {
        String cadena = ObtenerCadena();
        ContarAa(cadena);
    }
    
}
