package repaso_4;

import java.util.Scanner;

public class Repaso_4 {

    public static String ObtenerFrase() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una frase con paréntesis: ");
        String frase = entrada.nextLine();
        return frase;
    }
    
    public static void BalanceoParentesis(String frase) {
        char frasedesc[] = frase.toCharArray();
        boolean balanceado = false;
        int parentesis_abierto=0, parentesis_cerrado=0;
        for (int i = 0; i < frasedesc.length; i++) {
            if (parentesis_cerrado > parentesis_abierto) {
                balanceado = false;
                break;
            }
            if (frasedesc[i] == '(') {
                parentesis_abierto++;
            } else if (frasedesc[i] == ')') {
                parentesis_cerrado++;
            }
        }
        if (parentesis_cerrado == parentesis_abierto) {
                balanceado = true;
            }
        if (balanceado == true) {
            System.out.println("Balanceo de paréntesis correcto");
        } else {
            System.out.println("Balanceo de paréntesis incorrecto");
        }
    }
    
    public static void main(String[] args) {
        String frase = ObtenerFrase();
        BalanceoParentesis(frase);
    }
    
}
