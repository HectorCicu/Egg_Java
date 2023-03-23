package Egg.Guia4.Java_Subprogramas;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 * @author hhc
 */
public class Ejercicio_02_Guia4_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      boolean mayorEdad;
        Scanner read = new Scanner(System.in);
      String continua;
      do {
      mayorEdad = persona();
      if (mayorEdad = true) {
          System.out.println("Es mayor de edad");
      } else {
          System.out.println("Es menor de edad");
      }
          System.out.print("Continúa (no = sale // cualquier tecla = sigue):  ");
          continua = read.next();
     } while (!continua.toUpperCase().equals("NO"));
    }
    public static boolean persona() {
        Scanner read = new Scanner(System.in);
        String nombre;
        int edad;

        boolean mayor = false;
        System.out.print("\nIngrese el nombre de la pesona: ");
        nombre = read.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = read.nextInt();
        if (edad >= 18) {
            mayor = true;
        }
         System.out.println("\nNombre:" + nombre);
         System.out.println("Edad: "+  edad + " años");
        return mayor;

    }
}
