package excepciones;

import java.util.Scanner;

public class Excepciones {

    public static int ObtenerNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        return numero;
    }
    
    public static void main(String[] args) {
        try {
            int numero1 = ObtenerNumero();
            int numero2 = ObtenerNumero();
            int numerosuma = numero1 / numero2;
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Saliendo");
        }
    }
    
}
