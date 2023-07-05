package libreria.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

/**
 *
 * @author Hector Cicutti
 */
@NamedQueries({
    @NamedQuery(name = "editorial.buscarTodos", query ="Select e From Editorial e"),
    @NamedQuery(name = "editorial.buscarPorNombre", query = "SELECT e FROM Editorial e WHERE e.nombre LIKE  :name")
})
@Entity
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    private String nombre;

    public Editorial() {
    }

    public Editorial(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    
}
