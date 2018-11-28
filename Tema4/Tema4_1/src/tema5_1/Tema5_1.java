package tema5_1;

import java.util.Scanner;

public class Tema5_1 {

    public static String ObtenerCadena() {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.next();
        return frase;
    }
    
    public static void ObtenerMayusMinus(char frasedesc[]) {
        int contadorMayus=0, contadorMinus=0;
        for (int i = 0; i < frasedesc.length; i++) {
            if (Character.isLowerCase(frasedesc[i])){
                contadorMinus++;
            }
            else if (Character.isUpperCase(frasedesc[i])) {
                contadorMayus++;
            }
        }
        System.out.println("Hay "+contadorMinus+" letras minúsculas y "+contadorMayus+" letras mayúsculas");
    }
    
    public static void main(String[] args) {
        String frase = ObtenerCadena();
        char frasedesc[] = frase.toCharArray();
        ObtenerMayusMinus(frasedesc);
    }
    
}
