

package Entidades;

/**
 *
 * @author Hector Cicutti
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Integer duracion;
    private Integer precioEntrada;
    private Integer edadMinima;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion, Integer precioEntrada, Integer edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.precioEntrada = precioEntrada;
        this.edadMinima = edadMinima;
    }

   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Integer precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return  titulo + ", director=" + director + ", duracion=" + duracion + ", precioEntrada=" + precioEntrada + "\n";
    }

}
