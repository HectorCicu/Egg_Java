package libreria.entidades;

import javax.persistence.*;

/**
 *
 * @author Hector Cicutti
 */
@NamedQueries({
    @NamedQuery(name = "libro.buscarTodos", query = "SELECT l FROM Libro l"),
    @NamedQuery(name = "libro.buscarPorISBN", query = "SELECT l FROM Libro l WHERE l.isbn = :isbn"),
    @NamedQuery(name = "libro.buscarPorTitulo", query = "SELECT l FROM Libro l WHERE l.titulo LIKE :titulo"),
    //@NamedQuery(name = "libro.buscarPorAutor", query = "SELECT l FROM Libro JOIN l.autor a WHERE a.nombre LIKE :nombre"),
  //  @NamedQuery(name = "libro.buscarPorEditorial", query = "SELECT l FROM Libro JOIN l.editorial e WHERE e.nombre LIKE :nombre"),
})
@Entity
public class Libro {

    @Id
    @Column(nullable = false)
    private Long isbn;
    private String titulo;
    private Integer anio;
    private Integer ejemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    private Boolean alta;

    @ManyToOne
    private Autor autor;

    @ManyToOne
    private Editorial editorial;

    public Libro() {
    }

    public Libro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplaresRestantes = ejemplaresRestantes;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

}
