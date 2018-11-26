package repaso_2;

import java.util.Scanner;

public class Repaso_2 {

    public static String ObtenerFrase() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        return frase;
    }

    public static void Ventana(char frasedesc[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de veces que dará la vuelta la frase: ");
        int repeticion = entrada.nextInt();
        char ventana[] = new char[20];
        char ultimaposicion;
        int posicion_inicial = 19 - frasedesc.length;
        for (int i = 0; i < ventana.length; i++) {
            ventana[i] = ' ';
        }
        for (int i = 0; i < frasedesc.length; i++) {
            ventana[posicion_inicial + i + 1] = frasedesc[i];
        }
        for (int i = 1; i <= repeticion; i++) {
            System.out.println(i+" vuelta");
            for (int j = 0; j < ventana.length; j++) {
                    System.out.print(ventana[j]);
                }
            for (int m = 1; m <= 19; m++) {
                System.out.println();
                ultimaposicion = ventana[ventana.length - 1];
                ventana[ventana.length - 1] = ventana[0];
                for (int x = 0; x < ventana.length; x++) {
                    if (x + 1 == ventana.length - 1) {
                        ventana[x] = ultimaposicion;
                    } else {
                        if (x + 1 < ventana.length) {
                            ventana[x] = ventana[x + 1];
                        }
                    }
                    if (x == ventana.length - 1) {
                        ventana[19] = ventana[0];
                        ventana[0] = ' ';
                    }
                }
                for (int j = 0; j < ventana.length; j++) {
                    System.out.print(ventana[j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String frase = ObtenerFrase();
        char frasedesc[] = frase.toCharArray();
        Ventana(frasedesc);
    }

}
