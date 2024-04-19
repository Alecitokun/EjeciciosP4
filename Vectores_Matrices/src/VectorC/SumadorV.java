package VectorC;

public class SumadorV {
    public static int[] sumarVectores ( int[] A, int[] B){
        int n = A.length;
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }
        return C;
      }
    }


