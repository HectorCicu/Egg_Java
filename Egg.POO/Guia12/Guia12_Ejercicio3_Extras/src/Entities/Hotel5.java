package Entities;

public class Hotel5 extends Hotel4 {

    private int cantSuites;

    private int cantSalonesConf;

    private int cantLimusinas;

    public Hotel5() {
    }

    public Hotel5(int cantSuites, int cantSalonesConf, int cantLimusinas, String nombreRestaurant, int capacidadRestaurant, boolean gimnasio, char claseGimnasio, int habitaciones, int cantCamas, int cantPisos, double precioHabit, String nombre, String direccion, String nombreGerente, String localidad) {
        super(nombreRestaurant, capacidadRestaurant, gimnasio, claseGimnasio, habitaciones, cantCamas, cantPisos, precioHabit, nombre, direccion, nombreGerente, localidad);
        this.cantSuites = cantSuites;
        this.cantSalonesConf = cantSalonesConf;
        this.cantLimusinas = cantLimusinas;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(int cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public int getCantLimusinas() {
        return cantLimusinas;
    }

    public void setCantLimusinas(int cantLimusinas) {
        this.cantLimusinas = cantLimusinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "cantSuites=" + cantSuites + ", cantSalonesConf=" + cantSalonesConf + ", cantLimusinas=" + cantLimusinas + '}';
    }
    
}
