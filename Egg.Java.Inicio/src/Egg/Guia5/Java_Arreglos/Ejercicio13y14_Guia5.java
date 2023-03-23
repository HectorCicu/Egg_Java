package Egg.Guia5.Java_Arreglos;

import java.util.Scanner;

/**
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
 * de equipo y define su tipo de dato de tal manera que te permita alojar sus
 * nombres más adelante.
 *
 * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
 * compañeros de equipo
 *
 * @author hhc
 */
public class Ejercicio13y14_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese cantidad de personas en el equipo: ");
        int cant = read.nextInt();
        
        String[] equipo = new String[cant];
        
        for (int i = 0 ; i < equipo.length; i++) {
            System.out.print("Ingrese el nombre del miembro [" + (i+1) + " de " + equipo.length + "] ->" );
            equipo[i] = read.next();
        }
        System.out.println("");
        for (int i = 0 ; i < equipo.length; i++) {
            System.out.println("Integrante " + (i+1) + " del equipo:  " + equipo[i] );
      
        }
         
    }

}
