package Egg.Guia5.Java_Arreglos;

import java.util.Scanner;

/**
 * Ejercicio 13 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad
 * de compañeros de equipo y define su tipo de dato de tal manera que te permita
 * alojar sus nombres más adelante
 *
 * @author hhc
 */
public class Ejercicio13_14_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cursantes;

        System.out.print("Ingrese la cantidad de compañeros de curso: ");
        cursantes = read.nextInt();
        read.nextLine(); //  usado porque el nextLine del siguiente sout consume el enter que se carga cuando se confirma la cantidad de cursantes, haciiendo que  no lea el primer compañero
        String[] colegas = new String[cursantes];

        for (int i = 0; i < cursantes; ++i) {

            System.out.print("Ingrese el nombre del compañero [" + i + " de " + cursantes + "]: ");

            colegas[i] = read.nextLine();

        }
    }

}
