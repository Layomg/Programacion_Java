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
        int contador=0;
        System.out.print("Ingrese un valor a buscar: ");
        int x = entrada.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("El valor "+x+" se encuentra en la posición: "+i);
            }
            else {
                contador++;
            }
            if (contador == array.length) {
                System.out.println("No se ha encontrado el valor "+x);
            }
        }
    }

    public static void main(String[] args) {
        int n = ObtenerN();
        int array[] = new int[n];
        RellenarArray(array);
        BuscarX(array);
    }

}
