package Peliculas;

import java.util.Comparator;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación:
 *
 * @author Hector Cicutti
 */
public class Pelicula {

    private String titulo;
    private String Director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String Director, Double duracion) {
        this.titulo = titulo;
        this.Director = Director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        // return "Titulo= " + titulo + " -    Director= " + Director + " -    duracion=" + String.format("%.2f", String.format("%.2f", duracion)) ;
        return "Titulo= " + titulo + " -    Director= " + Director + " -    duracion= " + duracion;
    }

    public static Comparator<Pelicula> ordenarMenorDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarMayorDuracion = (Pelicula p1, Pelicula p2) -> p2.getDuracion().compareTo(p1.getDuracion());

    public static Comparator<Pelicula> ordenarTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());

    public static Comparator<Pelicula> ordenarDirector = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());
}
