package Perro;

import java.util.Comparator;

/**
 *
 * @author Hector Cicutti
 */
public class Perro {

    private String raza;
    private int edad;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }
    public static Comparator<Perro> comparaRaza = new Comparator<Perro>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Perro p1, Perro p2) { // Le pasamos dos objetos a comparar
            return p1.getRaza().compareTo(p2.getRaza()); // L
        }

    };
}
