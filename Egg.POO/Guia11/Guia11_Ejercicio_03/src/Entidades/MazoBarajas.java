

package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Hector Cicutti
 */
public class MazoBarajas {
 private ArrayList<Barajas>  mazo;

    public MazoBarajas() {
    }

    public MazoBarajas(ArrayList<Barajas> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Barajas> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Barajas> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "MazoBarajas{" + "mazo=" + mazo + '}';
    }
 
 
}
