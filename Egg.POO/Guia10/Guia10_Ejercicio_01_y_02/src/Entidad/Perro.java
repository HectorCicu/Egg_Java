package Entidad;

import java.util.Comparator;
import java.util.Objects;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 *
 * @author Hector Cicutti
 */
public class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private String color;
    private Character sexo;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(String nombre, String raza, Integer edad, String color, Character sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.raza);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perro other = (Perro) obj;
        return Objects.equals(this.raza, other.raza);
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ",    raza= " + raza + ",      edad= " + edad + ",      color= " + color + ",      sexo= " + sexo + '}';
    }

    public static Comparator<Perro> comparaRaza = new Comparator<Perro>() {
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getRaza().compareTo(o2.getRaza());
        }
    };
    
    public static Comparator<Perro> comparaEdad = new Comparator<Perro>() {
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getEdad().compareTo(o2.getEdad());
        }
    };
    
    public static Comparator<Perro> comparaSexo = new Comparator<Perro>() {
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getSexo().compareTo(o2.getSexo());
        }
    };
    
    public static Comparator<Perro> comparaNombre = new Comparator<Perro>() {
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };

}
