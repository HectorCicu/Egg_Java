package Entities;

public class PersonasFacultad {

    protected Integer id;

    protected String nombre;

    protected String apellido;

    protected String estadoCivil;

    public PersonasFacultad() {
    }

    public PersonasFacultad(Integer id, String nombre, String apellido, String estadoCivil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "PersonasFacultad{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + '}';
    }
    
}
