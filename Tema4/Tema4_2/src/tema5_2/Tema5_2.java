package tema5_2;

import java.util.Scanner;

public class Tema5_2 {

    public static String ObtenerCadena() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        return frase;
    }
    
    public static char ObtenerChar() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese un carácter: ");
        char chaar = entrada.next().charAt(0);
        return chaar;
    }
    
    public static void Buscar(String frase, char chaar) {
        int posicion, contador=0;
        posicion = frase.indexOf(chaar);
        while (posicion != -1) {
            contador++;
            posicion = frase.indexOf(chaar,posicion+1);
        }
        System.out.println("Hay "+contador+" letras "+chaar);
    }
    
    public static void main(String[] args) {
        String frase = ObtenerCadena();
        char chaar = ObtenerChar();
        Buscar(frase,chaar);
    }
    
}
