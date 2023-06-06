package Entities;

import Enums.Catedras;

public class Profesor extends PersonasFacultad {

    private Catedras catedra;

    public Profesor() {
    }

    public Profesor(Catedras catedra, Integer id, String nombre, String apellido, String estadoCivil) {
        super(id, nombre, apellido, estadoCivil);
        this.catedra = catedra;
    }

    public Catedras getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedras catedra) {
        this.catedra = catedra;
    }

    @Override
    public String toString() {
        return "Profesor{" + "catedra=" + catedra + '}';
    }
    
}
