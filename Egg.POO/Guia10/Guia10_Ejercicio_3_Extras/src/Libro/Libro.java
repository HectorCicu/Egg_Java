package Libro;

/**
 *
 * @author Hector Cicutti
 */
public class Libro {

    String nombreLibro;
    String autorLibro;
    Integer nroEjemplares;
    Integer ejemplaresPrestados;

    public Libro() {
        this.nroEjemplares = 0;
        this.ejemplaresPrestados = 0;

    }

    public Libro(String nombreLibro, String autorLibro,Integer nroEjemplares) {
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.nroEjemplares = nroEjemplares;
        this.ejemplaresPrestados = 0;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public Integer getNroEjemplares() {
        return nroEjemplares;
    }

    public void setNroEjemplares(Integer nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro:  " + nombreLibro + "   -   autorLibro=" + autorLibro + "\nnroEjemplares=" + nroEjemplares + "  -  ejemplaresPrestados=" + ejemplaresPrestados + '}';
    }

}
