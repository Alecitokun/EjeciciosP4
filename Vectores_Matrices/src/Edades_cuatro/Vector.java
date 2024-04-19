package Edades_cuatro;

public class Vector {
    private int[] elementos;
    public Vector(int tamaño) {
        elementos = new int[tamaño];
    }
    public void setElemento(int posicion, int valor) {
        elementos[posicion] = valor;
    }
    public int getElemento(int posicion) {
        return elementos[posicion];
    }
    public int getTamaño() {
        return elementos.length;
    }
}
