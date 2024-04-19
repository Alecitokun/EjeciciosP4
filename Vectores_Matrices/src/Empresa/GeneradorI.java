package Empresa;

public class GeneradorI {
    public static int[] generarInventario(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            if (B[i] == A[i]) {
                C[i] = A[i];
            } else if (B[i] > A[i]) {
                C[i] = 2 * (B[i] - A[i]);
            } else {
                C[i] = B[i];
            }
        }
        return C;
    }
}