package Estancias.entidades;

import java.util.Date;

/**
 *
 * @author Hector Cicutti
 */
public class Casas {

    private Integer idCasa;
    private String calle;
    private Integer numero;
    private String codPostal;
    private String ciudad;
    private String pais;
    private Date fechaDesde;
    private Date fechaHasta;
    private Integer tiempoMinimo;
    private Integer tiempoMaximo;
    private Double PrecioHabitacion;
    private String tipoVivienda;

    public Casas() {
    }

    public Casas(Integer idCasa, String calle, Integer numero, String ciudad, String codPostal, Date fechaDesde, Date fechaHasta, String pais, Double PrecioHabitacion, Integer tiempoMaximo, Integer tiempoMinimo, String tipoVivienda) {
        this.idCasa = idCasa;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.pais = pais;
        this.PrecioHabitacion = PrecioHabitacion;
        this.tiempoMaximo = tiempoMaximo;
        this.tiempoMinimo = tiempoMinimo;
        this.tipoVivienda = tipoVivienda;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getPrecioHabitacion() {
        return PrecioHabitacion;
    }

    public void setPrecioHabitacion(Double PrecioHabitacion) {
        this.PrecioHabitacion = PrecioHabitacion;
    }

    public Integer getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(Integer tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public Integer getTiempoMinimo() {
        return tiempoMinimo;
    }

    public void setTiempoMinimo(Integer tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public String toString() {
        return "Casas{" + "idCasa=" + idCasa + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + ", codPostal=" + codPostal + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", pais=" + pais + ", PrecioHabitacion=" + PrecioHabitacion + ", tiempoMaximo=" + tiempoMaximo + ", tiempoMinimo=" + tiempoMinimo + ", tipoVivienda=" + tipoVivienda + '}';
    }

}
