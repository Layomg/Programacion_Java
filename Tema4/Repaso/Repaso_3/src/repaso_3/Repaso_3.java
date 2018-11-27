package repaso_3;

import java.util.Scanner;

public class Repaso_3 {

    public static void RellenarVector(int vector[]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un valor para el array: ");
            vector[i] = entrada.nextInt();
        }
    }

    public static void BuscarParesEImpares(int vector[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un valor par o impar: ");
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] % 2 == 0) {
                    System.out.println(vector[i]);
                }
            }
        } else if (numero % 2 != 0) {
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] % 2 != 0) {
                    System.out.println(vector[i]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int vector[] = new int[20];
        RellenarVector(vector);
        BuscarParesEImpares(vector);
    }

}
