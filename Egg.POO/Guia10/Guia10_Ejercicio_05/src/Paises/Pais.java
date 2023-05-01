package Paises;

import java.util.Comparator;

/**
 *
 * @author Hector Cicutti
 */
public class Pais {

    private String pais;

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return  pais ;
    }

    public static Comparator<Pais> ordenarPaises = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return p1.getPais().compareTo(p2.getPais());
        }

    };
}
