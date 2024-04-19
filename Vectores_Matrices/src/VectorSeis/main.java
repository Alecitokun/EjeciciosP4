package VectorSeis;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[6];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        IntercambiadorV.intercambiarPosiciones(vector);

        System.out.println("\nVector después del intercambio:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }
    }
}