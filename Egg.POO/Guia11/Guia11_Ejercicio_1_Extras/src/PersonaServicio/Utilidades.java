

package PersonaServicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Comparator;

/**
 *
 * @author Hector Cicutti
 */
public class Utilidades {
    
public static Comparator<Persona> documento = (Persona p1, Persona p2) -> p1.getDni().compareTo(p2.getDni());

public static Comparator<Perro> ident =(Perro can1, Perro can2) -> can1.getId().compareTo(can2.getId());



}
