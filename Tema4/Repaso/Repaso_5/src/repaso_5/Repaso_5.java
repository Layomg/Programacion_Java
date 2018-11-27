package repaso_5;

import java.util.Scanner;

public class Repaso_5 {

    public static void RellenarVector(int vector[]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un valor para el vector: ");
            vector[i] = entrada.nextInt();
        }
    }
    
    public static void BuscarDivisiblePorN(int vector[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int N = entrada.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % N == 0) {
                System.out.println(vector[i]);
            }
        }
    }

    public static void main(String[] args) {
        int vector[] = new int[10];
        RellenarVector(vector);
        BuscarDivisiblePorN(vector);
    }

}
