package VectorSeis;

public class IntercambiadorV
{
        public static void intercambiarPosiciones(int[] vector) {
            int n = vector.length;
            for (int i = 0; i < n / 2; i++) {
                int temp = vector[i];
                vector[i] = vector[n - 1 - i];
                vector[n - 1 - i] = temp;
            }
        }
    }

