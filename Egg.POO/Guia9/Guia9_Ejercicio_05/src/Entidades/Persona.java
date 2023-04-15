package Entidades;

import java.util.Date;

/**
 * Implemente la clase Persona en el paquete entidades. Una persona tiene un
 * nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor
 * parametrizado, get y set.
 *
 * @author Temporal
 */
public class Persona {

    private String nombre;
    private Date fecNac;

    public Persona() {
    }

    public Persona(String nombre, Date fecNac) {
        this.nombre = nombre;
        this.fecNac = fecNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fecNac=" + fecNac + '}';
    }

}
