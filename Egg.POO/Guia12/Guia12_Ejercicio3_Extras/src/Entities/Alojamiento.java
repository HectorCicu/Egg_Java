package Entities;

public  class Alojamiento {

    protected String nombre;

    protected String direccion;

    protected String nombreGerente;

    protected String localidad;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String nombreGerente, String localidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nombreGerente = nombreGerente;
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", nombreGerente=" + nombreGerente + ", localidad=" + localidad + '}';
    }
    
}
