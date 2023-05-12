

package Entidades;

import java.util.Random;

/**
 *
 * @author Hector Cicutti
 */
public class Revolver {
private Integer posicionTambor;
private Integer posicionAgua;
Random rand = new Random();

    public Revolver() {
        this.posicionTambor = rand.nextInt(1,7);
        this.posicionAgua = rand.nextInt(1,7);
    }

    public Revolver(Integer posicionTambor, Integer posicionAgua) {
        this.posicionTambor = posicionTambor;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionTambor() {
        return posicionTambor;
    }

    public void setPosicionTambor(Integer posicionTambor) {
        this.posicionTambor = posicionTambor;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionTambor=" + posicionTambor + ", posicionAgua=" + posicionAgua + '}';
    }


}
