package Alumno;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Hector Cicutti
 */
public class Alumno_Map {

    private Integer legajo;
    private String nombreAlumno;
    private Integer nroDni;
    private ArrayList<Integer> nota = new ArrayList<Integer>();

    public Alumno_Map() {
    }

    public Alumno_Map(Integer legajo, String nombreAlumno, Integer nroDni) {
        this.legajo = legajo;
        this.nombreAlumno = nombreAlumno;
        this.nroDni = nroDni;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Integer getNroDni() {
        return nroDni;
    }

    public void setNroDni(Integer nroDni) {
        this.nroDni = nroDni;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return  "   Nombre = " + nombreAlumno + ",   DNI= " + nroDni + ", nota=" + nota + '}';
    }

    /**
     * Ordena los legajos de menor a mayor
     */
    public static Comparator<Alumno_Map> ordenaLegajo = new Comparator<Alumno_Map>() {
        @Override
        public int compare(Alumno_Map a1, Alumno_Map a2) {  
            return a1.getLegajo().compareTo(a2.getLegajo()); //a1 - a2 ordena ascendente -- a2 -a1 ordena descendente

        }

    };
    // LAMBDA 
    public static Comparator<Alumno_Map> ordenaNombre = (Alumno_Map a1, Alumno_Map a2) -> a1.getNombreAlumno().compareTo(a2.getNombreAlumno());
}
