

package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Hector Cicutti
 */
public class Voto {
private Alumnos alumno;
private ArrayList<Alumnos> votados;

    public Voto(Alumnos alumno, ArrayList<Alumnos> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Voto() {
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumnos> getVotados() {
        return votados;
    }

    public void setVotados(ArrayList<Alumnos> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", votados=" + votados + "\n";
    }


}
