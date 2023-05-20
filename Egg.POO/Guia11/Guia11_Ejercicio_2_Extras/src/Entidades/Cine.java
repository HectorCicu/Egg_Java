

package Entidades;


import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Hector Cicutti
 */
public class Cine {
private Pelicula pelicula;
List<CineUbicaciones> cn = new LinkedList<>();

    public Cine() {
    }

    public Cine(Pelicula pelicula, LinkedList<CineUbicaciones> cn) {
        this.pelicula = pelicula;
       this.cn = cn;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

 

    public LinkedList<CineUbicaciones> getCn() {
        return (LinkedList<CineUbicaciones>) cn;
    }

    public void setCn(LinkedList<CineUbicaciones> cn) {
        this.cn = cn;
    }

    @Override
    public String toString() {
        return " Pelicula=" + pelicula +  ", cn=" + cn + "\n";
    }

  

}
