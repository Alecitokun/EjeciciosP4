package The_Big_Old;

public class CKilometraje {

    public static int[] calcularTotalKilometraje(int[][] kilometraje) {
        int n = kilometraje.length;
        int[] totalKilometraje = new int[n];

        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += kilometraje[i][j];
            }
            totalKilometraje[i] = total;
        }
        return totalKilometraje;
    }
}