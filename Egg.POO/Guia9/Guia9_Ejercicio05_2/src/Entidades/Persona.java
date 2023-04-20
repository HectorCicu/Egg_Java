package Entidades;

import java.util.Date;

/**
 * Implemente la clase Persona en el paquete entidades. Una persona tiene un
 * nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor
 * parametrizado, get y set. Crear una clase PersonaService, en el paquete
 * servicio, con los siguientes métodos:
 *
 * @author Hector Cicutti
 */
public class Persona {

    private String nombre;
    private Date fechaNac;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
    }
    
    
    
}
