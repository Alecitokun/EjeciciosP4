package Sumas;

public class Sumador
{
        public static int sumar(int[] arreglo) {
            int suma = 0;
            for (int i = 0; i < arreglo.length; i++) {
                suma += arreglo[i];
            }
            return suma;
        }
    }

