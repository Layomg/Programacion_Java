package repaso_11;

public class Repaso_11 {

    public static void RellenarMatriz(double matriz[][]) {
        for (int i = 0; i < 365; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = Math.floor(Math.random() * 100);
            }
        }
    }

    public static void BuscarDiferentes(double matriz[][], double numerosdiferentes[]) {
        numerosdiferentes[0] = matriz[0][0];
        int contador = 1, contadordiferente = 0;
        for (int i = 0; i < 365; i++) {
            contadordiferente = 0;
            for (int x = 0; x < contador; x++) {
                if (matriz[i][0] != numerosdiferentes[x]) {
                    contadordiferente++;
                    if (contadordiferente == contador) {
                        numerosdiferentes[contador] = matriz[i][0];
                        contadordiferente = 0;
                        contador++;
                    }
                }
            }
        }
        System.out.println("Números diferentes");
        for (int i = 0; i < contador; i++) {
            System.out.println(numerosdiferentes[i]);
        }
    }

    public static void OrdenarMatriz(double matriz[][]) {
        double menor, mayor;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 365; j++) {
                for (int x = 0; x < 365; x++) {
                    if (matriz[x][i] < matriz[j][i]) {
                        menor = matriz[x][i];
                        mayor = matriz[j][i];
                        matriz[j][i] = menor;
                        matriz[x][i] = mayor;
                    }
                }
            }
        }
    }

    public static void MostrarMatriz(double matriz[][]) {
        for (int i = 0; i < 365; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j]+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        double matriz[][] = new double[365][10];
        double numerosdiferentes[] = new double[366];
        RellenarMatriz(matriz);
        BuscarDiferentes(matriz, numerosdiferentes);
        OrdenarMatriz(matriz);
        MostrarMatriz(matriz);
    }

}
