

package Entidades;

import java.util.TreeMap;

/**
 *
 * @author Hector Cicutti
 */
public class Adoptados {
private TreeMap<Integer, Integer>  adoptado;

    public Adoptados() {
    }

    public Adoptados(TreeMap<Integer, Integer> adoptado) {
        this.adoptado = adoptado;
    }

    public TreeMap<Integer, Integer> getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(TreeMap<Integer, Integer> adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Adoptados:"  + adoptado + "\n";
    }
    


 }
