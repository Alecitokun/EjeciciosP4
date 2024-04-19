package Edades_cuatro;

import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = sc.nextInt();

        Vector edadesAlumnos = new Vector(cantidadAlumnos);

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            int edad = sc.nextInt();
            edadesAlumnos.setElemento(i, edad);
        }
        System.out.println("Edades de los alumnos:");
        for (int i = 0; i < edadesAlumnos.getTamaño(); i++) {
            System.out.println("Alumno " + (i + 1) + ": " + edadesAlumnos.getElemento(i));
        }
    }
}
