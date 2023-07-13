package libreria.entidades;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;

@NamedQueries({
    @NamedQuery(name = "autor.buscarTodos", query = "Select a From Autor a"),
    @NamedQuery(name = "autor.buscarPorNombre", query = "SELECT a FROM Autor a WHERE a.nombre LIKE  :name")
})
@Entity
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    private String nombre;
    private Boolean alta;

    public Autor() {
    }

    public Autor(Integer id, String nombre, Boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }
  public Autor( String nombre, Boolean alta) {
       
        this.nombre = nombre;
        this.alta = alta;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Autor \n" + "id=" + id + ", nombre=" + nombre + ", alta=" + alta + '}';
    }

}
