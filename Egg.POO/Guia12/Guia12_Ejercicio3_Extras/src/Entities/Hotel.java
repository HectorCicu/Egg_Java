package Entities;

import java.util.Comparator;

public abstract class Hotel extends Alojamiento {

    protected int habitaciones;

    protected int cantCamas;

    protected int cantPisos;

    protected Double precioHabit;

    public Hotel() {
    }

    public Hotel(int habitaciones, int cantCamas, int cantPisos, Double precioHabit, String nombre, String direccion, String nombreGerente, String localidad) {
        super(nombre, direccion, nombreGerente, localidad);
        this.habitaciones = habitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioHabit = precioHabit;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabit() {
        return precioHabit;
    }

    public void setPrecioHabit(Double precioHabit) {
        this.precioHabit = precioHabit;
    }

    @Override
    public String toString() {
        return "Hotel{" + "habitaciones=" + habitaciones + ", cantCamas=" + cantCamas + ", cantPisos=" + cantPisos + ", precioHabit=" + precioHabit + '}';
    }
    
//public class comparadorPrecio implements Comparator<Hotel> {
//    @Override
//    public int compare (Hotel precio1, Hotel precio2) {
//        return precio1.precioHabit.compareTo(precio2.precioHabit);
//    };
//}

}
