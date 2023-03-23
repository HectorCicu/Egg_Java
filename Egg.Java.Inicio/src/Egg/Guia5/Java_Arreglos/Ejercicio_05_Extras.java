package Egg.Guia5.Java_Arreglos;

import java.util.Scanner;
import java.util.Random;

/**
 * Realizar un programa que llene una matriz de tamaño NxM con valores
 * aleatorios y muestre la suma de sus elementos.
 *
 * @author hhc
 */
public class Ejercicio_05_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese cantidad de fillas de la matriz: ");
        int filas = read.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        int col = read.nextInt();

        int[][] matriz = new int[filas][col];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("La suma de los elementos de la matriz es: "+ sumaElementos(matriz));

    }

    public static void llenarMatriz(int[][] arreglo) {
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; ++i) {
            for (int j = 0; j < arreglo[0].length; ++j) {
                arreglo[i][j] = rand.nextInt(1000);
            }
        }
    }

    public static void mostrarMatriz(int[][] arreglo) {
        String aux = "";
        for (int[] filas : arreglo) {
            aux = "[ ";
            for (int j : filas) {
                aux += "  " + j;
            }
            System.out.println(aux + " ]");
        }
    }

    public static int sumaElementos(int[][] arreglo) {
        int total = 0;
        for (int i = 0; i < arreglo.length; ++i) {
            for (int j = 0; j < arreglo[0].length; ++j) {
                total += arreglo[i][j];
            }
        }
        return total;
    }
}
