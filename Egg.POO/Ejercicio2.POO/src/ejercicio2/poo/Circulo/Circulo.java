package ejercicio2.poo.Circulo;

import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class Circulo {

    Scanner read = new Scanner(System.in);

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void  crearCirculo() {
        System.out.print("Ingrese radio en cm.: ");
       // double rad = read.nextDouble();
      setRadio(read.nextDouble());
    }

    public double areaCirculo(double radio) {
        return (Math.PI * Math.pow(radio, 2));

    }
    public double perimCirculo(double radio) {
        return (Math.PI * radio * 2);

    }
}
