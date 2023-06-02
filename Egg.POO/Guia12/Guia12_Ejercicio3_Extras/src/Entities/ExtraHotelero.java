package Entities;

public class ExtraHotelero extends Alojamiento {

    private boolean privado;

    private int metrosCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, int metrosCuadrados, String nombre, String direccion, String nombreGerente, String localidad) {
        super(nombre, direccion, nombreGerente, localidad);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" + "privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + '}';
    }
    
}
