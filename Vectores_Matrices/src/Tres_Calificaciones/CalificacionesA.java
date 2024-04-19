package Tres_Calificaciones;

public class CalificacionesA {
        private double[][] calificaciones;

        public CalificacionesA(int numAlumnos, int numMaterias) {
            calificaciones = new double[numAlumnos][numMaterias];
        }
        public void setCalificacion(int alumno, int materia, double calificacion) {
            calificaciones[alumno][materia] = calificacion;
        }
        public double getCalificacion(int alumno, int materia) {
            return calificaciones[alumno][materia];
        }
    }

