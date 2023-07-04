package Estancias.entidades;

import java.util.Date;

/**
 *
 * @author Hector Cicutti
 */
public class Estancias {

    public Integer idEstancia;
    public Integer idCliente;
    public Integer idCasa;
    public String nombreCliente;
    public Date fechaDesde;
    public Date fechaHasta;

    public Estancias() {
    }

    public Estancias(Integer idEstancia, Integer idCliente, Integer idCasa, String nombreCliente, Date fechaDesde, Date fechaHasta) {
        this.idEstancia = idEstancia;
        this.idCliente = idCliente;
        this.idCasa = idCasa;
        this.nombreCliente = nombreCliente;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
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
