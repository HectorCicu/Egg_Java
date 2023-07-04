package Estancias.entidades;

/**
 *
 * @author Hector Cicutti
 */
public class Familias {

    private Integer idFamilia;
    private String nombreFamilia;
    private Integer edadMinima;
    private Integer edadMaxima;
    private Integer numHijos;
    private String email;
    private Integer idCasaFamilia;

    public Familias() {
    }

    public Familias(Integer idFamilia, String nombreFamilia, Integer numHijos, Integer edadMinima, Integer edadMaxima, String email, Integer idCasaFamilia) {
        this.idFamilia = idFamilia;
        this.nombreFamilia = nombreFamilia;
        this.numHijos = numHijos;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.email = email;
        this.idCasaFamilia = idCasaFamilia;
    }

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public void setNombreFamilia(String nombreFamilia) {
        this.nombreFamilia = nombreFamilia;
    }

    public Integer getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(Integer numHijos) {
        this.numHijos = numHijos;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Integer getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Integer edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdCasaFamilia() {
        return idCasaFamilia;
    }

    public void setIdCasaFamilia(Integer idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }

    @Override
    public String toString() {
        return "Familias{" + "idFamilia=" + idFamilia + ", nombreFamilia=" + nombreFamilia + ", numHijos=" + numHijos + ", edadMinima=" + edadMinima + ", edadMaxima=" + edadMaxima + ", email=" + email + ", idCasaFamilia=" + idCasaFamilia + '}';
    }

}
