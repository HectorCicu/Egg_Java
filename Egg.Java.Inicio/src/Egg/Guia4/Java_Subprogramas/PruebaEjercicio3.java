package Egg.Guia4.Java_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author hhc
 */
public class PruebaEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese la cantidad a cambiar ");
        double euros = leer.nextInt(); //--Original

        System.out.println(" Ingrese la moneda a la que quiere cambiar D Dolar, Y Yen, L Libra");
        String cambio = leer.next();  //--original

        //double cambio = Cambiar(leer.nextInt(), leer.next());  // Otra versión agregando la lectura en la misma llamada a la función.
        System.out.println("La cantidad obtenida es " + cambio);

        System.out.println("La cantidad obtenida es " + Cambiar(euros, cambio));  //--original
    }

    public static double Cambiar(double euros, String cambio) {

        double resultado = 0;

        if (cambio.equals("D")) {
            resultado = euros / 1.28611;

        } else if (cambio.equals("Y")) {
            resultado = euros / 129.852;
        } else if (cambio.equals("L")) {
            resultado = euros / 0.86;
        }
        return resultado;
    }
}
