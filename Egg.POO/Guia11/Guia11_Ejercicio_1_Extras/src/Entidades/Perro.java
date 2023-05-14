package Entidades;

import Enum.PerroTamanio;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona
 *
 * @author Hector Cicutti
 */
public class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private PerroTamanio tamanio;
    private Integer id;


    public Perro() {
    }

    public Perro(Integer id, String nombre, String raza, Integer edad, PerroTamanio tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.id= id;
  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public PerroTamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(PerroTamanio tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return  " Id: " + id + "    nombre = " + nombre + ",        raza= " + raza + ",        edad= " + edad + ",       tamaño= " + tamanio ;
    }

 

}
