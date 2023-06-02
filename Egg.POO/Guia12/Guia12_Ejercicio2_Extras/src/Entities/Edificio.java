package Entities;

import java.text.DecimalFormat;

/**
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho,
 * alto y largo. La clase edificio tendrá como métodos: • Método
 * calcularSuperficie(): calcula la superficie del edificio. • Método
 * calcularVolumen(): calcula el volumen del edifico. Estos métodos serán
 * abstractos y los implementarán las siguientes clases: • Clase Polideportivo
 * con su nombre y tipo de instalación que puede ser
 *
 * @author Hector Cicutti
 */
public abstract class Edificio {
    DecimalFormat df = new DecimalFormat("#.00");
    protected int ancho;
    protected int alto;
    protected int largo;

    public abstract int calcularSuperficie();

    public abstract int calcularVolumen();

    public Edificio() {
    }

    public Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

//    switch ((1 <= num && num <= 5 ) ? 0 : (6 <= num && num <= 10) ? 1 : (11 <= num && num <= 15) ? 2 : 3) 
//		{ 
//			case 0: System.out.println("I'm between one and five inclusive."); 
//			break; 
//			case 1: System.out.println("I'm between 6 and 10 inclusive."); 
//			break; 
//			case 2: System.out.println("I'm between 11 and 15 inclusive."); 
//			break;
//			case 3: System.out.println("I'm not between."); 
//			break; 
//			}
}
