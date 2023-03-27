package Calcular;

import Puntos.Punto_;
import java.util.Scanner;

/**
 *
 * @author hhc
 */
public class CalculaPuntos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto_ p1 = new Punto_();
        Scanner read = new Scanner(System.in); //.useDelimiter("\n");

        System.out.print("Ingrese coordenada X1: ");
        p1.setX1(read.nextInt());
        System.out.print("Ingrese coordenada y1: ");
        p1.setY1(read.nextInt());
        System.out.print("Ingrese coordenada X2: ");
        p1.setX2(read.nextInt());
        System.out.print("Ingrese coordenada y2: ");
        p1.setY2(read.nextInt());

        System.out.println("\nLa distancia entre puntos es " + p1.distancia());

    }

}
