package Egg.Guia5.Java_Arreglos;

import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
 * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa
 *
 * @author hhc
 */
public class Ejercicio05_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese cardinalidad de la matriz: ");
        int card = read.nextInt();
        int[][] matriz1 = new int[card][card];
        int[][] matriz2 = new int[card][card];

        llenarManualArreglo(matriz1);

        transponerArreglo(matriz1, matriz2);
        imprimeArreglo(matriz1);
        
        if (compararAntisimetrica(matriz1, matriz2) == true) {
            System.out.println("\nLa seguna matriz es Antisimétrica \n ");
        } else {
            System.out.println("\nLa segunda matriz NO es antisimétrica\n");
        }
        System.out.println("Primera Matriz\n");
        imprimeArreglo(matriz1);

        System.out.println("\nSegunda  Matriz\n");
        imprimeArreglo(matriz2);

    }

    public static void llenarManualArreglo(int[][] arreglo) {
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < arreglo[0].length; ++i) {
            for (int j = 0; j < arreglo[0].length; ++j) {
                System.out.print("Ingrese el valor de la posición " + i + "," + j + " del arreglo -> ");
                arreglo[i][j] = read.nextInt();
            }
        }
    }

    public static void transponerArreglo(int[][] arreglo1, int[][] arreglo2) {

        for (int i = 0; i < arreglo1[0].length; ++i) {
            for (int j = 0; j < arreglo1.length; ++j) {
                arreglo2[i][j] = arreglo1[j][i];
            }
        }
    }

    public static boolean compararAntisimetrica(int[][] arreglo1, int[][] arreglo2) {
        boolean esAnti = true;
        for (int i = 0; i < arreglo1[0].length; ++i) {
            for (int j = 0; j < arreglo1.length; ++j) {
                if (arreglo1[i][j] != arreglo2[i][j] * (-1)) {
                    esAnti = false;
                }
            }
        }
        return esAnti;
    }

    public static void imprimeArreglo(int[][] arreglo) {
        String aux;
        for (int[] filas : arreglo) {
            aux = "[ ";
            for (int j : filas) {
                aux += "  " + j;
            }
            System.out.println(aux + " ]");
        }
    }

}
