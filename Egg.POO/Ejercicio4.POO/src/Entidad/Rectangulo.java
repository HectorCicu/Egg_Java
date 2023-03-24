package Entidad;

import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class Rectangulo {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void cargaDatos() {
        System.out.print("Ingrese base del rectángulo en cm.: ");
        setBase(read.nextDouble());
        System.out.print("Ingrese altura del rectángulo en cm.: ");
        setAltura(read.nextDouble());
    }

    public double area() {
        return (double) getBase() * getAltura();

    }

    public double perimetro() {
        return (double) (getBase() + getAltura()) * 2;

    }

    public void dibuja() {
        for (int i = 1; i <= getAltura(); ++i) {
            for (int j = 1; j <= getBase(); ++j) {
                if (i == 1 || i == (int) getAltura()) {
                    System.out.print("*");
                } else if (j == 1 || j == (int) getBase()) {
                    System.out.print("*");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

}
