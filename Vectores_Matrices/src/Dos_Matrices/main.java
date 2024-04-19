package Dos_Matrices;

public class main {
    public static void main(String[] args) {

        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrizB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] resultado = SumadorM.sumarMatrices(matrizA, matrizB);

        System.out.println("Resultado de la suma de las matrices:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
        }
    }
}
