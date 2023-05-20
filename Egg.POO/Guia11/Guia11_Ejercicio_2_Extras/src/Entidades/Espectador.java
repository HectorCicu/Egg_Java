

package Entidades;

/**
 *
 * @author Hector Cicutti
 */
public class Espectador {
private String nombreEspectador;
private Integer edadEspectador;
private Integer dineroDisponible;

    public Espectador() {
    }

    public Espectador(String nombreEspectador, Integer edadEspectador, Integer dineroDisponible) {
        this.nombreEspectador = nombreEspectador;
        this.edadEspectador = edadEspectador;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombreEspectador() {
        return nombreEspectador;
    }

    public void setNombreEspectador(String nombreEspectador) {
        this.nombreEspectador = nombreEspectador;
    }

    public Integer getEdadEspectador() {
        return edadEspectador;
    }

    public void setEdadEspectador(Integer edadEspectador) {
        this.edadEspectador = edadEspectador;
    }

    public Integer getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Integer dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombreEspectador=" + nombreEspectador + ", edadEspectador=" + edadEspectador + ", dineroDisponible=" + dineroDisponible + '}';
    }


}
