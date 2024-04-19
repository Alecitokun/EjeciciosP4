package Sumas;

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        int suma = Sumador.sumar(arreglo);
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
