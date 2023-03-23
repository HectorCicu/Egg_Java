package Egg.Guia3.Java_Estructuras_de_Control;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios: Los socios tipo ‘A’ abonan una
 * cuota mayor, pero tienen un 50% de descuento en todos los tipos de
 * tratamientos. Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
 * de descuento para los mismos tratamientos que los socios del tipo A. Los
 * socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
 * tratamientos. Solicite una letra (carácter) que representa la clase de un
 * socio, y luego un valor real que represente el costo del tratamiento (previo
 * al descuento) y determine el importe en efectivo a pagar por dicho socio.
 *
 * @author Temporal
 */
public class Ejercicio_05_Guia3_Extras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        char tipoSocio = ' ';
        double importe, total = 0;
        do {
            System.out.print("Ingrese categoría de asociado: ");
            tipoSocio = lee.next().charAt(0);

        } while (tipoSocio != 'a' && tipoSocio != 'A' && tipoSocio != 'b' && tipoSocio != 'B' && tipoSocio != 'c' && tipoSocio != 'C');
        System.out.print("Ingrese monto del tratamiento: ");
        importe = lee.nextDouble();

        switch (tipoSocio) {
            case 'A':
            case 'a':
                total = importe * 0.5;
                break;
            case 'B':
            case 'b':
                total = importe * 0.65;
                break;
            case 'C':
            case 'c':
                total = importe;
                break;
            default:
                System.out.println("Ingresaste una opción inválida");
        }
        System.out.println("\nEl importe a abonar por ser asociado categoría " + tipoSocio + " es $ " + total);
    }

}
