package Fraccion;

/**
 * Crear una clase llamada fracción que contenga 2 atributos (denominador y
 * numerador de cada fracción). Crear la clase servicio que contenga métodos
 * para sumar, restar, multiplicar y dividir fracciones. Mostrar por pantalla un
 * menú de opciones para que el usuario decida que ver.
 *
 * @author Temporal
 */
public class Fraccion {

    private int n1;
    private int d1 = 1;

    public Fraccion() {
    }

    public Fraccion(int n1, int d1) {
        this.n1 = n1;
        this.d1 = d1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "n1=" + n1 + ", d1=" + d1 + '}';
    }

    
}
