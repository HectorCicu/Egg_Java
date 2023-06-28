

package Estancias.entidades;

import java.util.Date;

/**
 *
 * @author Hector Cicutti
 */
public class Estancias {

public Date fechaDesde;
public Date fechaHasta;
public Integer idCasa;
public Integer idCliente;
public Integer idEstancia;

    public Estancias() {
    }


    public Estancias(Date fechaDesde, Date fechaHasta, Integer idCasa, Integer idCliente, Integer idEstancia) {
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.idCasa = idCasa;
        this.idCliente = idCliente;
        this.idEstancia = idEstancia;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdEstancia() {
        return idEstancia;
    }

    public void setIdEstancia(Integer idEstancia) {
        this.idEstancia = idEstancia;
    }

    @Override
    public String toString() {
        return "Estancias{" + "fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", idCasa=" + idCasa + ", idCliente=" + idCliente + ", idEstancia=" + idEstancia + '}';
    }


}
