package VectorC;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de los vectores: ");
        int longitud = scanner.nextInt();

        int[] A = new int[longitud];
        int[] B = new int[longitud];

        System.out.println("Ingrese los elementos del primer vector (A):");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Ingrese los elementos del segundo vector (B):");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }
        int[] C = SumadorV.sumarVectores(A, B);

        System.out.println("El resultado de la suma de los vectores es:");
        for (int i = 0; i < longitud; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}