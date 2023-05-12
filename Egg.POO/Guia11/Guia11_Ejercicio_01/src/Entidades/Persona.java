

package Entidades;

/**
 *
 * @author Hector Cicutti
 */
public class Persona {
private String nombre;
private String apellido;
private Integer dni;
private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
       
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

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return  "nombre= " + nombre + " -  apellido= " + apellido + "  -  dni= " + dni + " \n     Perro " + perro ;
    }

}
