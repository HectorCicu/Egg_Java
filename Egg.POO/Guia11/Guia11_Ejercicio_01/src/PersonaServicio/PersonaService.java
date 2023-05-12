package PersonaServicio;

import Entidades.Perro;
import Entidades.Persona;
import Enum.PerroTamanio;

import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class PersonaService {

    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public static void cargaPersona() {
// creo los objetos personas
        Persona p1 = new Persona("Héctor", "Cicutti", 17413394);
        Persona p2 = new Persona("Carlos", "Ramirez", 194555678);
        Persona p3 = new Persona("Fernando", "Alonso", 34777888);

//instancio los objetos perros
        Perro pe1 = new Perro("Fer Chiquito", "Boxer", 3, PerroTamanio.GRANDE);
        Perro pe2 = new Perro("Lola", "Pitbull", 2, PerroTamanio.CHICO);
        Perro pe3 = new Perro("TresPatas", "Callejero", 3, PerroTamanio.MEDIANO);

//agregamos la mascota a la Persona
        p1.setPerro(pe3);
        p2.setPerro(pe1);
        p3.setPerro(pe2);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }

}
