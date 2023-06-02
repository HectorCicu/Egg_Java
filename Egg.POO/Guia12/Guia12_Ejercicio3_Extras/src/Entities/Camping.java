package Entities;

public class Camping extends ExtraHotelero {

    private int cantCarpas;

    private int cantBanos;

    private boolean tieneRestaurant;

    public Camping() {
    }

    public Camping(int cantCarpas, int cantBanos, boolean tieneRestaurant, boolean privado, int metrosCuadrados, String nombre, String direccion, String nombreGerente, String localidad) {
        super(privado, metrosCuadrados, nombre, direccion, nombreGerente, localidad);
        this.cantCarpas = cantCarpas;
        this.cantBanos = cantBanos;
        this.tieneRestaurant = tieneRestaurant;
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public int getCantBanos() {
        return cantBanos;
    }

    public void setCantBanos(int cantBanos) {
        this.cantBanos = cantBanos;
    }

    public boolean isTieneRestaurant() {
        return tieneRestaurant;
    }

    public void setTieneRestaurant(boolean tieneRestaurant) {
        this.tieneRestaurant = tieneRestaurant;
    }

    @Override
    public String toString() {
        return "Camping{" + "cantCarpas=" + cantCarpas + ", cantBanos=" + cantBanos + ", tieneRestaurant=" + tieneRestaurant + '}';
    }

    
}
