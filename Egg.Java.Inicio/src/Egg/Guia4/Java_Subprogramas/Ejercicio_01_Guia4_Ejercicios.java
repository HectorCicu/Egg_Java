package Egg.Guia4.Java_Subprogramas;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 *
 *
 * @author hhc
 */
public class Ejercicio_01_Guia4_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double resultado = 0;
        int num1, num2, opc;
        System.out.print("Ingrese el primer numero: ");
        num1 = read.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = read.nextInt();

        System.out.println("\nMENU DE OPCIONES");
        System.out.println("-----------------------");
        System.out.println("1_ Sumar");
        System.out.println("2_ Restar");
        System.out.println("3_ Multiplicar");
        System.out.println("4_ Dividir");
        System.out.print("Ingrese la opción -> ");
        opc = read.nextInt();
        switch (opc) {
            case 1:
                resultado = suma(num1, num2);
                break;

            case 2:
                resultado = resta(num1, num2);
                break;

            case 3:
                resultado = multiplicacion(num1, num2);
                break;

            case 4:
                resultado = division(num1, num2);
                break;
        }
        System.out.println("\nEl resultado de la operación es: " + resultado);
        System.out.println("");
    
    }

    public static double suma(int n1, int n2) {
        double resul = n1 + n2;
        return resul;
    }

    public static double resta(int n1, int n2) {
        double resul = n1 - n2;
        return resul;
    }

    public static double multiplicacion(int n1, int n2) {
        double resul = n1 * n2;
        return resul;
    }

    public static double division(int n1, int n2) {
       double resul = 0;
        if (n2 == 0) {
            System.out.println("Lo siento, el divisor es cero, no puede realizarse la operación.");
          
        } else {
             resul = (double) n1 / (double) n2;
        
    }
        return resul;
}
}
