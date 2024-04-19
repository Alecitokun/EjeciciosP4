package Empresa;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] existencia = new int[10];
        int[] pedidos = new int[10];

        System.out.println("Ingrese la cantidad en existencia de cada producto:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            existencia[i] = scanner.nextInt();
        }
        System.out.println("Ingrese la cantidad de pedidos de cada producto:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            pedidos[i] = scanner.nextInt();
        }
        int[] inventario = GeneradorI.generarInventario(existencia, pedidos);

        System.out.println("\nInventario requerido para mantener el stock:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Producto " + (i + 1) + ": " + inventario[i]);
        }
    }
}
