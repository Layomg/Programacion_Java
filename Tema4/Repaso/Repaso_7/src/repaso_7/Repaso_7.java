package repaso_7;

import java.util.Scanner;

public class Repaso_7 {

    public static int ObtenerN() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int N = entrada.nextInt();
        return N;
    }

    public static int ObtenerM() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de columnas: ");
        int M = entrada.nextInt();
        return M;
    }

    public static void RellenarMatriz(int matriz[][], int N, int M) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Ingrese un valor para la matriz: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    public static void OrdenarMatriz(int matriz[][], int N, int M) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese a o e: ");
        char opcion = entrada.next().charAt(0);
        int mayor=0, menor=0;
        if (opcion == 'a') {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    for (int x = 0; x < M; x++) {
                        if (matriz[i][x] < matriz[i][j]) {
                            menor = matriz[i][x];
                            mayor = matriz[i][j];
                            matriz[i][j] = menor;
                            matriz[i][x] = mayor;
                        }
                    }
                }
            }
        } else if (opcion == 'e') {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    for (int x = 0; x < M; x++) {
                        if (matriz[i][j] < matriz[i][x]) {
                            menor = matriz[i][x];
                            mayor = matriz[i][j];
                            matriz[i][j] = menor;
                            matriz[i][x] = mayor;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        int N = ObtenerN();
        int M = ObtenerM();
        int matriz[][] = new int[N][M];
        RellenarMatriz(matriz, N, M);
        OrdenarMatriz(matriz, N, M);
    }

}
