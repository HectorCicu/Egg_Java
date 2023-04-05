package Main;

import Entidades.Persona;
import Servicios.PersonaServicios;

/**
 *
 * @author hhc
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicios ps = new PersonaServicios();
        int[] edades = new int[4], imcs = new int[4];

        Persona p1 = new Persona();
        ps.crearPersona(p1);

        imcs[0] = ps.calcularIMC(p1);
        edades[0] = p1.getEdad();

        Persona p2 = new Persona();
        ps.crearPersona(p2);
        imcs[1] = ps.calcularIMC(p2);
        edades[1] = p2.getEdad();

        Persona p3 = new Persona();
        ps.crearPersona(p3);
        imcs[2] = ps.calcularIMC(p1);
        edades[2] = p3.getEdad();

        Persona p4 = new Persona();
        ps.crearPersona(p4);
        imcs[3] = ps.calcularIMC(p4);
        edades[3] = p4.getEdad();

    }

}
