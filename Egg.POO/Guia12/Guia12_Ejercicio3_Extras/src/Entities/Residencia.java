package Entities;

public class Residencia extends ExtraHotelero {

    private int cantHabitaciones;

    private boolean descuentoGremios;

    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuentoGremios, boolean campoDeportivo, boolean privado, int metrosCuadrados, String nombre, String direccion, String nombreGerente, String localidad) {
        super(privado, metrosCuadrados, nombre, direccion, nombreGerente, localidad);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHabitaciones=" + cantHabitaciones + ", descuentoGremios=" + descuentoGremios + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
}
