package Entities;

import Enums.Secciones;

public class PersonalDeServicio extends PersonasFacultad {

    private Secciones seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(Secciones seccion, Integer id, String nombre, String apellido, String estadoCivil) {
        super(id, nombre, apellido, estadoCivil);
        this.seccion = seccion;
    }

    public Secciones getSeccion() {
        return seccion;
    }

    public void setSeccion(Secciones seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" + "seccion=" + seccion + '}';
    }
    
}
