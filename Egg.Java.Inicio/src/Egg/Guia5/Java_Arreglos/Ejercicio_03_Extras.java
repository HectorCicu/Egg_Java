package Egg.Guia5.Java_Arreglos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 *
 * @author martucicu
 */
public class Ejercicio_03_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner read = new Scanner(System.in);
        int llenar;
        System.out.print("Ingrese tamaño del vector: ");
        int tam = read.nextInt();
 
      int[] vector1 = llenarVector(tam);
      imprimirVector(vector1);
      
    }
        
         public static int [] llenarVector(int tam) {
          int[] vector = new int[tam];
        Random rand = new Random();

        for (int i = 0; i < vector.length; ++i) {
              vector[i] = (int) (rand.nextInt(1000));

            }

        return vector;

    }
         
         public static void imprimirVector(int[] vector) {
              System.out.println("\nVector1: " + Arrays.toString(vector));
         }
}
    


