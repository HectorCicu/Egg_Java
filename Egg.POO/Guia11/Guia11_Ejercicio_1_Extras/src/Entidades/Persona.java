

package Entidades;

import java.util.ArrayList;


/**
 *
 * @author Hector Cicutti
 */
public class Persona {
private String nombre;
private String apellido;
private Integer dni;

    
private ArrayList<Perro> perro = null;

    public Persona() {
        this.perro = null;
    }

    public Persona(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
   //3     this.perro = null;
       
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

    public ArrayList<Perro> getPerro() {
        return perro;
    }

    public void setPerro(ArrayList<Perro> perro) {
        this.perro = perro;
    }



    @Override
    public String toString() {
        return  "nombre= " + nombre + " -  apellido= " + apellido  +"\n" + "Perro " + perro + "\n" ;
    }

    
}
