package tema5_4;

import java.util.Scanner;

public class Tema5_4 {

    public static char ObtenerChar() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese una letra: ");
        char chaar = entrada.next().charAt(0);
        return chaar;
    }
    
    public static String ObtenerCadena() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        return frase;
    }
    
    public static void SustituirXenS(String S, char X) {
        S = S.replace(X,Character.toUpperCase(X));
        System.out.println(S);
    }
    
    public static void main(String[] args) {
        String S = ObtenerCadena();
        char X = ObtenerChar();
        SustituirXenS(S,X);
    }
    
}
