

package Entidades;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Hector Cicutti
 */
public class Salas {
private Map<String, Cine> sala = new HashMap(); 

    public Salas() {
    }
    public Salas(HashMap<String, Cine> sala) {
        this.sala = sala;
    }

    public Map<String, Cine> getSala() {
        return sala;
    }

    public void setSala(Map<String, Cine> sala) {
        this.sala = sala;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.sala);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Salas other = (Salas) obj;
        return Objects.equals(this.sala, other.sala);
    }

    @Override
    public String toString() {
        return "Salas" + sala ;
    }

}
