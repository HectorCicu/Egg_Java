
package libreria.entidades;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Hector Cicutti
 */
@NamedQueries({
@NamedQuery(name = "cliente.listar", query = "SELECT c FROM Cliente c"),
@NamedQuery(name = "cliente.buscarPorDoc", query = "SELECT c FROM Cliente c WHERE c.documento = :docCliente")
})
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer Id;
    private Long documento;
    private String nombre;
    private String apellido;
    private String telefono;

    public Cliente() {
    }

    public Cliente(Integer Id, Long documento, String nombre, String apellido, String telefono) {
        this.Id = Id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
public Cliente( Long documento, String nombre, String apellido, String telefono) {
       
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Id=" + Id + ", documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }
    
}
