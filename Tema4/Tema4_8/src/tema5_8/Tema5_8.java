package tema5_8;

import java.util.Scanner;

public class Tema5_8 {

    public static String ObtenerCadena() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese una frase: ");
        String cadena = entrada.nextLine();
        return cadena;
    }
    
    public static void Contar_a(String cadena) {
        int contador_a = 0;
        int posicion = cadena.indexOf("a");
        while (posicion != -1) {
            contador_a++;
            posicion = cadena.indexOf("a",posicion+1);
        }
        if (contador_a > 10) {
            System.out.println("Exceso de a");
        }
    }
    
    public static void Contar_o(String cadena) {
        int contador_o = 0;
        int posicion = cadena.indexOf("o");
        while (posicion != -1) {
            contador_o++;
            posicion = cadena.indexOf("o",posicion+1);
        }
        if (contador_o > 5) {
            System.out.println("Exceso de o");
        }
    }
    
    public static void Contar_e(String cadena) {
        int contador_e = 0;
        int posicion = cadena.indexOf("e");
        while (posicion != -1) {
            contador_e++;
            posicion = cadena.indexOf("e",posicion+1);
        }
        if (contador_e > 4) {
            System.out.println("Exceso de e");
        }
    }
    
    public static void main(String[] args) {
        String cadena = ObtenerCadena();
        Contar_a(cadena);
        Contar_o(cadena);
        Contar_e(cadena);
    }
    
}
