package Nombres;

public class OrdenadorA
{
        public static void ordenarPorPromedio(String[] nombres, double[] promedios) {
            int n = promedios.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (promedios[j] < promedios[j + 1]) {
                        double tempPromedio = promedios[j];
                        promedios[j] = promedios[j + 1];
                        promedios[j + 1] = tempPromedio;
                        String tempNombre = nombres[j];
                        nombres[j] = nombres[j + 1];
                        nombres[j + 1] = tempNombre;
                    }
                }
            }
        }
    }

