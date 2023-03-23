package Egg.Guia5.Java_Arreglos;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * @author hhc
 */
public class Ejercicio06_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner read = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int[] control = new int[1];
        boolean[] esMagico = new boolean[1];
        esMagico[0] = true;
        llenarManualArreglo(matriz1);
        sumaElementos(matriz1, 1, control, esMagico);  // sumo las filas y devuelvo si es mágico hasta el momiento
        if (esMagico[0]) {

            int sumaControl = control[0];
            System.out.println("\n" + esMagico[0] + "    " + sumaControl);
            sumaElementos(matriz1, 2, control, esMagico); // sumo las columnas y devuelvo si es mágico hasta el momento
            //        sumaControl = control[0];
            //     System.out.println("\n" + esMagico[0] + "    " + sumaControl);
            if (esMagico[0] && (sumaControl == control[0])) {   // valido si desde la suma de las columnas es mágico y además la suma de cada colmuna es igual al control anterior

                sumaDiagonales(matriz1, 1, control); // Sumo la diagonal principal
                if (control[0] == sumaControl) {
                    sumaDiagonales(matriz1, 2, control);   // sumo la diagonal secundaria
                    if (control[0] == sumaControl) {
                        System.out.println("\nEl cuadrado ES MAGICO\n");

                    }

                }
            }
        } else {
            System.out.println("\n El cuadrado NO ES magico\n");
        }
        imprimeArreglo(matriz1);
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

    public static void sumaElementos(int[][] arreglo, int tipo, int[] control1, boolean[] esMagic) {

        control1[0] = 0;
        int[] sumas = new int[3];

        for (int i = 0; i < arreglo[0].length; ++i) {
            for (int j = 0; j < arreglo[0].length; ++j) {
                switch (tipo) {
                    case 1:
                        sumas[i] += arreglo[i][j];
                        break;
                    case 2:
                        sumas[j] += arreglo[i][j];
                        break;
                }
            }
        }
        if ((sumas[0] == sumas[1]) && (sumas[1] == sumas[2])) {
            control1[0] = sumas[1];
            esMagic[0] = true;
        } else {
            esMagic[0] = false;

        }
    }

    public static void sumaDiagonales(int[][] arreglo, int tipo, int[] control1) {

        control1[0] = 0;
        int sumas = 0;

        for (int i = 0; i < arreglo[0].length; ++i) {
            for (int j = 0; j < arreglo[0].length; ++j) {
                switch (tipo) {
                    case 1:
                        if (i == j) {
                            sumas += arreglo[i][j];
                        }
                        break;
                    case 2:
                        if (i == 2 - j) {
                            sumas += arreglo[i][j];
                            //System.out.println(" diagonal cruzada " + i + " " + j + " " + sumas);
                        }
                        break;
                }
            }
        }

        control1[0] = sumas;
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
