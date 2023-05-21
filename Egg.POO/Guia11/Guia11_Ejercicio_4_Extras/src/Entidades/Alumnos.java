package Entidades;

import java.util.Comparator;



/**
 * 
 * @author Hector Cicutti
 */
public class Alumnos {

    private String nombreAlumno;
    private Integer dni;
    private boolean voto;
    

    public Alumnos() {
    }

    public Alumnos(String nombreAlumno, Integer dni) {
        this.nombreAlumno = nombreAlumno;
        this.dni = dni;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }
    
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public boolean isVotado() {
        return voto;
    }

    public void setVotado(boolean voto) {
        this.voto = voto;
    }
    

    @Override
    public String toString() {
        return "Alumnos{" + "nombreAlumno=" + nombreAlumno + ", dni=" + dni ;
    }
    
    public static Comparator<Alumnos> ordenarDni = (Alumnos a1, Alumnos a2) -> a1.getDni().compareTo(a2.getDni()); 
    
}
