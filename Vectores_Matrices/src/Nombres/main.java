package Nombres;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = sc.nextInt();

        String[] nombres = new String[numAlumnos];
        double[] promedios = new double[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            sc.nextLine();
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingrese el promedio del alumno " + (i + 1) + ": ");
            promedios[i] = sc.nextDouble();
        }
        OrdenadorA.ordenarPorPromedio(nombres, promedios);

        System.out.println("\nAlumnos ordenados por promedio de mayor a menor:");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Nombre: " + nombres[i] + ", Promedio: " + promedios[i]);
        }
    }
}
