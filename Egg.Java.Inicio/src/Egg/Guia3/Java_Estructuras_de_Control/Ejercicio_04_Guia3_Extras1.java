package Egg.Guia3.Java_Estructuras_de_Control;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
 * muestre su equivalente en romano.
 *
 * @author Temporal
 */
public class Ejercicio_04_Guia3_Extras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int numero;
        String romano = "";
        do {
        System.out.print("Ingrese un número de 1 a 10 para convertirlo en romano: ");
        numero = lee.nextInt();
        
        } while (numero < 1 || numero > 10);
        
        switch (numero){
            case 1:
                  romano = "I";
                  break;
                  
            case 2:
                  romano = "II";
                  break;
                  
            case 3:
                  romano = "III";
                  break;
                  
            case 4:
                  romano = "IV";
                  break;
                  
            case 5:
                  romano = "V";
                  break;
                  
            case 6:
                  romano = "VI";
                  break;
                  
            case 7:
                  romano = "VII";
                  break;
                  
            case 8:
                  romano = "VIII";
                  break;
                  
            case 9:
                  romano = "IX";
                  break;
                  
            case 10:
                  romano = "X";
                  break;
                  
        }
        
            System.out.println("\nEl equivalente en romano del número " + numero + " es " + romano);   
        
    }

}
