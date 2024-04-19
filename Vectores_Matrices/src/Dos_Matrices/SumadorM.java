package Dos_Matrices;

public class SumadorM
{
    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
            int filas = matrizA.length;
            int columnas = matrizA[0].length;
            int[][] resultado = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    resultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            return resultado;
        }
    }

