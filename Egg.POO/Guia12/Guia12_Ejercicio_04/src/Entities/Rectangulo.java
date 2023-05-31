package Entities;

/**
 *
 * @author Hector Cicutti
 */
public class Rectangulo implements CalculosFormas {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
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

    @Override
    public void calcularArea() {
        System.out.println("El área del rectángulo es: " + (base * altura));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del rectángulo es " + ((base + altura * 2)));
    }

}
