package Entities;

public class Hotel4 extends Hotel {

    private String nombreRestaurant;

    private int capacidadRestaurant;

    private boolean gimnasio;

    private char claseGimnasio;

    public Hotel4() {
    }

    public Hotel4(String nombreRestaurant, int capacidadRestaurant, boolean gimnasio, char claseGimnasio, int habitaciones, int cantCamas, int cantPisos, double precioHabit, String nombre, String direccion, String nombreGerente, String localidad) {
        super(habitaciones, cantCamas, cantPisos, precioHabit, nombre, direccion, nombreGerente, localidad);
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
        this.gimnasio = gimnasio;
        this.claseGimnasio = claseGimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public char getClaseGimnasio() {
        return claseGimnasio;
    }

    public void setClaseGimnasio(char claseGimnasio) {
        this.claseGimnasio = claseGimnasio;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "nombreRestaurant=" + nombreRestaurant + ", capacidadRestaurant=" + capacidadRestaurant + ", gimnasio=" + gimnasio + ", claseGimnasio=" + claseGimnasio + '}';
    }
    
}
