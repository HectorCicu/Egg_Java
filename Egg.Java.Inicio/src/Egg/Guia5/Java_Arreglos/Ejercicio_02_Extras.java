package Egg.Guia5.Java_Arreglos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 *
 * @author hhc
 */
public class Ejercicio_02_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int llenar;
        System.out.print("Ingrese tamaño de los vectores: ");
        int tam = read.nextInt();
        do {
            System.out.print("Llenado manual (0) o llenado por random (1) ? -> ");
            llenar = read.nextInt();

        } while (llenar > 1);
        int[] vector1 = new int[tam];
        int[] vector2 = new int[tam];

        llenarVector(vector1, llenar); // con 1 se llena con aleatorios, con 0, manual
        llenarVector(vector2, llenar); // con 1 se llena con aleatorios, con 0, manual
        comparaVectores(vector1, vector2);
        System.out.println("\nVector1: " + Arrays.toString(vector1));
        System.out.println("\nVector2: " + Arrays.toString(vector2));
    }

    public static void llenarVector(int[] vector, int forma) {
        Scanner read = new Scanner(System.in);
        Random rand = new Random();

        for (int i = 0; i < vector.length; ++i) {
            if (forma == 0) {
                System.out.print("Ingrese posición  [" + i + " de " + vector.length + "]  -> ");
                vector[i] = read.nextInt();
            } else {
                vector[i] = (int) (rand.nextInt(4));

            }

        }

    }

    public static void comparaVectores(int[] arreglo1, int[] arreglo2) {

        if (Arrays.equals(arreglo1, arreglo2)) {
            System.out.println("\nLos vectores son iguales");
        } else {
            System.out.println("\nLos vectores NO son iguales");
        }
    }

}
