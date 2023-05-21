

package Entidades;

/**
 *
 * @author Hector Cicutti
 */
public class Votado {
private Integer dniVotado;
private Integer cantVotos;

    public Votado() {
    }

    public Votado(Integer dniVotado, Integer cantVotos) {
        this.dniVotado = dniVotado;
        this.cantVotos = cantVotos;
    }

    public Integer getDniVotado() {
        return dniVotado;
    }

    public void setDniVotado(Integer dniVotado) {
        this.dniVotado = dniVotado;
    }

    public Integer getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(Integer cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return  "dniVotado=" + dniVotado + ", cantVotos=" + cantVotos + "\n";
    }



}
