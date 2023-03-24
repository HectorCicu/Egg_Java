package Ejercicio_02_Extras;

import Entidad.Punto;

/**
 *
 * @author hhc
 */
public class Ejercicio_02_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p1 = new Punto();
        p1.coordenadas();
        Punto p2 = new Punto();
        p2.coordenadas();
        Punto p3 = new Punto();

        System.out.println("\nLa distancia entre puntos es: " + p3.calculaDistancia(p1.getX(), p1.getY(), p2.getX(), p2.getY()));

    }

}
