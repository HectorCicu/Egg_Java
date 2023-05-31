package Entities;

/**
 *
 * @author Hector Cicutti
 */
public class Circulo implements CalculosFormas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del Círculo es: " + (PI * Math.pow(radio, 2)));

    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del Círculo es: " + (PI * radio * 2));
    }

}
