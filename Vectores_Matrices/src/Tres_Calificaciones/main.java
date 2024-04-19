package Tres_Calificaciones;

public class main{
    public static void main(String[] args) {

        CalificacionesA calificaciones = new CalificacionesA(2, 3);

        calificaciones.setCalificacion(0, 0, 6.5);
        calificaciones.setCalificacion(0, 1, 1.9);
        calificaciones.setCalificacion(0, 2, 9.2);


        calificaciones.setCalificacion(1, 0, 2.3);
        calificaciones.setCalificacion(1, 1, 4.8);
        calificaciones.setCalificacion(1, 2, 8.1);

        System.out.println("Calificaciones de los alumnos en cada materia:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.println("Materia " + (j + 1) + ": " + calificaciones.getCalificacion(i, j));
            }
        }
    }
}
