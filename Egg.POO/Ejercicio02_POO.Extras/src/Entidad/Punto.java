package Entidad;

import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class Punto {

    private double x;
    private double y;

    public Punto() {
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void coordenadas() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese ordenada (x): ");
        setX(read.nextDouble());
        System.out.print("Ingrese abscisa (y): ");
        setY(read.nextDouble());
    }

    public double calculaDistancia(double x, double y, double x1, double y1) {
        double dist;
        dist =  Math.sqrt( Math.pow((x1 - x), 2) +  Math.pow((y1 - y), 2));

        return dist;
    }
}
