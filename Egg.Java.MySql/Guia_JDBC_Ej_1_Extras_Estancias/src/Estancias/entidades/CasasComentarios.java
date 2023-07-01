package Estancias.entidades;

/**
 *
 * @author Hector Cicutti
 */
public class CasasComentarios {

    private Integer idCasa;
    private String calle;
    private Integer numero;
    private String codPostal;
    private String ciudad;
    private String pais;
    private String comentario;

    public CasasComentarios() {
    }

    public CasasComentarios(Integer idCasa, String calle, Integer numero, String codPostal, String ciudad, String pais, String comentario) {
        this.idCasa = idCasa;
        this.calle = calle;
        this.numero = numero;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.comentario = comentario;
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

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "CasasComentarios{" + "idCasa=" + idCasa + ", calle=" + calle + ", numero=" + numero + ", codPostal=" + codPostal + ", ciudad=" + ciudad + ", pais=" + pais + ", comentario=" + comentario + '}';
    }

}
