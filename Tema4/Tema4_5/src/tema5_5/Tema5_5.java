package tema5_5;

import java.util.Scanner;

public class Tema5_5 {

    public static String ObtenerCadena() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        return frase;
    }
    
    public static void main(String[] args) {
        String S = ObtenerCadena();
        S = S.replace(" ", "");
        System.out.println(S);
    }
    
}
