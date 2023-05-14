package PersonaServicio;

import Entidades.Perro;
import Entidades.Persona;
import Enum.PerroTamanio;
import static PersonaServicio.Utilidades.documento;
import static PersonaServicio.Utilidades.ident;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Hector Cicutti
 */
public class PersonaService {

    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static TreeMap<Integer, Persona> adoptantes = new TreeMap(documento);
    private static TreeMap<Integer, Perro> jauria = new TreeMap(ident);
    private static Random rand = new Random();

    public static void cargaPersonasyPerros() {
// creo los objetos personas
        String nombre = "", apellido = "", nombrePerro = "", raza = "";
        PerroTamanio tamanio = PerroTamanio.CHICO;
        Integer dni = 0, idPerro = 0, edad = 0;
        int var, var2, var3, var4, var5;
        for (int i = 1; i < 40; ++i) {
            dni = rand.nextInt(12000000, 40000000);
            var = rand.nextInt(1, 7);
            var2 = rand.nextInt(1, 7);
            switch (var) {
                case 1 ->
                    nombre = "Lisa";
                case 2 ->
                    nombre = "Maggie";
                case 3 ->
                    nombre = "Jimmy";
                case 4 ->
                    nombre = "Homero";
                case 5 ->
                    nombre = "Edna";
                case 6 ->
                    nombre = "Moe";
            }
            switch (var2) {
                case 1 ->
                    apellido = "González";
                case 2 ->
                    apellido = "Rodriguez";
                case 3 ->
                    apellido = "Pérez";
                case 4 ->
                    apellido = "Maccio";
                case 5 ->
                    apellido = "Cabral";
                case 6 ->
                    apellido = "Page";
            }

            adoptantes.put(dni, new Persona(nombre, apellido, dni));
        }

//instancio los objetos perros
        for (int i = 1; i < 70; ++i) {
            idPerro = rand.nextInt(1, 4000);
            var = rand.nextInt(1, 7); //nombre
            edad = rand.nextInt(1, 10); // edad perro
            var4 = rand.nextInt(1, 8); // raza
            var5 = rand.nextInt(1, 4); // tamaño
            switch (var) {
                case 1 ->
                    nombrePerro = "Fer Chiquito";
                case 2 ->
                    nombrePerro = "Lola Polola";
                case 3 ->
                    nombrePerro = "Katun von Kessel";
                case 4 ->
                    nombrePerro = "Ayudante de Santa";
                case 5 ->
                    nombrePerro = "Bobby Brown";
                case 6 ->
                    nombrePerro = "Mister Dog";
            }

            switch (var4) {
                case 1 ->
                    raza = "Bulldog";
                case 2 ->
                    raza = "Rotweiller";
                case 3 ->
                    raza = "Pastor alemán";
                case 4 ->
                    raza = "Labrador";
                case 5 ->
                    raza = "Caniche";
                case 6 ->
                    raza = "Dogo";
                case 7 ->
                    raza = "Callejero";
            }

            switch (var5) {
                case 1 ->
                    tamanio = PerroTamanio.MEDIANO;
                case 2 ->
                    tamanio = PerroTamanio.GRANDE;
                case 3 ->
                    tamanio = PerroTamanio.CHICO;
            }
            jauria.put(idPerro, new Perro(idPerro, nombrePerro, raza, edad, tamanio));
        }
    }

}

