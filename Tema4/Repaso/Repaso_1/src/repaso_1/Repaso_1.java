package repaso_1;

import java.util.Scanner;

public class Repaso_1 {

    public static int ObtenerN() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int n = entrada.nextInt();
        return n;
    }

    public static void RellenarArray(int array[]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un valor para el array: ");
            array[i] = entrada.nextInt();
        }
    }
    
    public static void BuscarX(int array[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un valor a buscar: ");
        int x = entrada.nextInt();
    }
    
    public static void main(String[] args) {
        int n = ObtenerN();
        int array[] = new int[n];
    }

}
