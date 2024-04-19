package The_Big_Old;

public class main {
    public static void main(String[] args) {

        int[][] kilometraje = {
                {50, 60, 70, 80, 90, 100},
                {45, 55, 65, 75, 85, 95},
                {40, 50, 60, 70, 80, 90}
        };
        int[] totalKilometraje = CKilometraje.calcularTotalKilometraje(kilometraje);

        System.out.println("Reporte de kilómetros recorridos por cada chofer durante la semana:");
        for (int i = 0; i < kilometraje.length; i++) {
            System.out.println("Chofer " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.println("Día " + (j + 1) + ": " + kilometraje[i][j] + " km");
            }
            System.out.println("Total: " + totalKilometraje[i] + " km");
        }
    }
}