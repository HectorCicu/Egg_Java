

package Cafetera;

/**
 *
 * @author Temporal
 */
public class Cafetera {
private int cantidadTazas;
private int capacMaxima = 20;

    public Cafetera() {
    }

    public Cafetera(int cantidadTazas, int capacMaxima) {
        this.cantidadTazas = cantidadTazas;
        this.capacMaxima = capacMaxima;
    }

    public int getCantidadTazas() {
        return cantidadTazas;
    }

    public void setCantidadTazas(int cantidadTazas) {
        this.cantidadTazas = cantidadTazas;
    }

    public int getCapacMaxima() {
        return capacMaxima;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "cantidadTazas=" + cantidadTazas + ", capacMaxima=" + capacMaxima + '}';
    }

    public void setCapacMaxima(int capacMaxima) {
        this.capacMaxima = capacMaxima;
    }


}
