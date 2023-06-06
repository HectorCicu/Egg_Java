package Entities;

import java.util.ArrayList;

public class Estudiante extends PersonasFacultad {

    private ArrayList<String> cursoAsignado;

    public Estudiante() {
    }

    public Estudiante(ArrayList<String> cursoAsignado, Integer id, String nombre, String apellido, String estadoCivil) {
        super(id, nombre, apellido, estadoCivil);
        this.cursoAsignado = cursoAsignado;
    }

    public ArrayList<String> getCursoAsignado() {
        return cursoAsignado;
    }

    public void setCursoAsignado(ArrayList<String> cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cursoAsignado=" + cursoAsignado + '}';
    }

   
}
