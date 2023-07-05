package libreria.entidades;

import javax.persistence.*;
import javax.persistence.Entity;

@NamedQueries({
    @NamedQuery(name = "autor.buscarTodos", query = "Select a From Autor a"),
    @NamedQuery(name = "autor.buscarPorNombre", query = "SELECT a FROM Autor a WHERE a.nombre LIKE  :name")
})
@Entity
public class Autor {

    @Id
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

}
