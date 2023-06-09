package Egg.Guia3.Java_Estructuras_de_Control;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por
 * ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
 * siguiente:
 *
 * @author Temporal
 */
public class Ejercicio8_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);

        System.out.print("Ingrese cantidad de elementos del cuadrado:  ");
        int elementos = lee.nextInt();

        for (int i = 0; i < elementos; ++i) {
            for (int j = 0; j < elementos; ++j) {

                if ((i == 0 || i == elementos - 1) && j < elementos -1) {
                    System.out.print("*");
                }else if (j == elementos - 1) {
                        System.out.println("*");

                   } else if (j == 0) {
                       System.out.print("*");
                   }else if (j > 0 && j < elementos -1) {
                       System.out.print(" ");
                   }
                }

            }

        }

}
