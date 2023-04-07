

package Entidades;

/**
 *
 * @author Temporal
 */
public class Nif {
private long Dni;
private char letra;

    public Nif() {
    }

    public Nif(long Dni) {
        this.Dni = Dni;
    }


    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Nif{" + "Dni=" + Dni + ", letra=" + letra + '}';
    }

}
