package Egg.Guia5.Java_Arreglos;

import java.util.Scanner;

/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 *
 * @author hhc
 */
public class Ejercicio_01_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector  ->  ");
        int cant = read.nextInt();
        int[] vector1 = new int[cant];
        cargaVector(vector1);
        sumaVector(vector1);

    }

    public static void cargaVector(int[] vector) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < vector.length; ++i) {
            System.out.print("Ingrese posición  [" + i + " de " + vector.length + "]  -> ");
            vector[i] = read.nextInt();
        }
    }

    public static void sumaVector(int[] vector) {
        int totalSuma = 0;
        for (int i = 0; i < vector.length; ++i) {
            totalSuma += vector[i];
        }

        System.out.println("\nEl total de la suma de elementos del vector es: " + totalSuma);
        System.out.println("");

    }

}
