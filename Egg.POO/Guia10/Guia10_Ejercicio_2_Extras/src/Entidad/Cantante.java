

package Entidad;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author Hector Cicutti
 */
public class Cantante {
private String Nombre;
private String Nacionalidad;
 HashMap<String, Integer> discos = new HashMap();

    public Cantante(String Nombre, String Nacionalidad) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
    }

    public Cantante() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public HashMap<String, Integer> getDiscos() {
        return discos;
    }

    public void setDiscos(HashMap<String, Integer> discos) {
        this.discos = discos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Nombre);
        hash = 89 * hash + Objects.hashCode(this.Nacionalidad);
        hash = 89 * hash + Objects.hashCode(this.discos);
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
        final Cantante other = (Cantante) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Nacionalidad, other.Nacionalidad)) {
            return false;
        }
        return Objects.equals(this.discos, other.discos);
    }

    @Override
    public String toString() {
        return  "Nombre=" + Nombre + " -  Nacionalidad=" + Nacionalidad + "  -  discos=" + discos + '}';
    }
 

}
