package repaso_10;

import java.util.Scanner;

public class Repaso_10 {

    public static int ObtenerFilas() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int N = entrada.nextInt();
        return N;
    }

    public static int ObtenerColumnas() {
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

    public static int BuscarColumna(int matriz[][], int N, int M) {
        int columna = 0;
        int mayor = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (j + 1 <= M) {
                    if (matriz[i][j] > mayor) {
                        columna = j;
                        mayor = matriz[i][j];
                    }
                }
            }
        }
        return columna;
    }

    public static void OrdenarColumna(int matriz[][], int N, int M, int columna) {
        int mayor, menor;
        for (int x = 0; x < N; x++) {
            for (int i = 0; i < N; i++) {
                if (i + 1 < N) {
                    if (matriz[i][columna] < matriz[i + 1][columna]) {
                        mayor = matriz[i + 1][columna];
                        menor = matriz[i][columna];
                        matriz[i][columna] = mayor;
                        matriz[i + 1][columna] = menor;
                    }
                }
            }
        }
    }

    public static void MostrarMatriz(int matriz[][], int N, int M) {
        System.out.println("Matriz ordenada");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int N = ObtenerFilas();
        int M = ObtenerColumnas();
        int matriz[][] = new int[N][M];
        RellenarMatriz(matriz, N, M);
        int columna = BuscarColumna(matriz, N, M);
        OrdenarColumna(matriz, N, M, columna);
        MostrarMatriz(matriz, N, M);
    }

}
