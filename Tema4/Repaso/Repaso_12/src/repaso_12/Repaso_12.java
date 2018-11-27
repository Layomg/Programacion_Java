package repaso_12;

import java.util.Scanner;

public class Repaso_12 {

    public static String ObtenerString() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static void BuscarChar(String cadena) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un carácter: ");
        char caracter = entrada.next().charAt(0);
        for (int i = 0; i < cadena.length();i++) {
            if (cadena.charAt(i) == caracter) {
                System.out.println("El caracter "+caracter+ " se encuentra en "+cadena);
            }
        }
    }
    
    public static void main(String[] args) {
        String nombre = ObtenerString();
        BuscarChar(nombre);
    }
    
}
