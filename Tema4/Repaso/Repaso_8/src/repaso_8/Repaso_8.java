package repaso_8;

import java.util.Scanner;

public class Repaso_8 {

    public static void ObtenerString(String vector[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su primer apellido: ");
        String apellido1 = entrada.nextLine();
        System.out.print("Ingrese su segundo apellido: ");
        String apellido2 = entrada.nextLine();
        vector[0] = apellido1;
        vector[1] = apellido2;
        vector[2] = nombre;
    }
    
    public static void MostrarVector(String vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        String vector[] = new String[3];
        ObtenerString(vector);
        MostrarVector(vector);
    }
    
}
