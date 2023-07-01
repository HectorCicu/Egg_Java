

package Estancias.entidades;

/**
 *
 * @author Hector Cicutti
 */
public class Comentarios {

    private Integer idComentario;
    private Integer idCasa;
    private String comentario;

    public Comentarios() {
    }

    public Comentarios(Integer idComentario, String comentario, Integer idCasa) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.idCasa = idCasa;
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    @Override
    public String toString() {
        return "Comentarios{" + "idComentario=" + idComentario + ", comentario=" + comentario + ", idCasa=" + idCasa + '}';
    }


}
