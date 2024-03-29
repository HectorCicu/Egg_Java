package libreria.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author Hector Cicutti
 */

@NamedQueries({
    @NamedQuery(name = "prestamo.buscarPorID", query = "SELECT p FROM Prestamo p WHERE p.id = :idprest"),
    @NamedQuery(name = "prestamo.buscarPorCliente", query = "SELECT p FROM Prestamo p WHERE p.cliente.documento = :dniCli"),

})
@Entity
public class Prestamo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)

    private Integer id;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaPrestamo;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaDevolucion;

    @OneToOne
    private Libro libro;

    @OneToOne
    private Cliente cliente;

//    public Prestamo(Date parse, Cliente cli, Libro book) {
//}

    public Prestamo() {
    }

   

    public Prestamo(Integer id, Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.cliente = cliente;
    }

    public Prestamo(Date fechaPrestamo, Libro libro, Cliente cliente) {
        this.fechaPrestamo = fechaPrestamo;
        this.libro = libro;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", libro=" + libro + ", cliente=" + cliente + '}';
    }

}
