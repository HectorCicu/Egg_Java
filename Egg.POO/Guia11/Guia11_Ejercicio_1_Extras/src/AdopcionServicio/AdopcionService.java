package AdopcionServicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import java.util.TreeMap;

/**
 *
 * @author Hector Cicutti
 */
public class AdopcionService {

    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static TreeMap<Integer, Persona> adoptantes = new TreeMap();
    private static TreeMap<Integer, Persona> adoptados = new TreeMap(); //guarda la relación 
    private static TreeMap<Integer, Perro> jauria = new TreeMap();
    private static Random rand = new Random();
    private static Utilidades ut = new Utilidades();

    public static void menu() {
        ut.cargaPersonasyPerros(adoptantes, jauria);
        int opc;

        do {
            System.out.println("""
                         MENU ADOPCION
                         ------------------------
                         1- Listar Personas Adoptantes
                         2- Listar Perros Disponibles
                         3- Adoptar Perro
                         4- Lista de Adopciones
                         5- Salir  """);
            do {

                System.out.print("Opcion: ");
                opc = read.nextInt();
            } while (opc < 1 || opc > 5);
            switch (opc) {
                case 1 ->
                    listaAdoptantes(adoptantes);
                case 2 ->
                    listaPerrosDisponibles(jauria);
                case 3 ->
                    adoptarPerro(adoptantes, jauria, adoptados);
                case 4 ->
                    listaAdoptados(adoptados);
            }

        } while (opc < 5);
    }

    public static void listaAdoptantes(TreeMap<Integer, Persona> adoptante) {
        Integer dni;
        Persona person;
        for (Map.Entry<Integer, Persona> pers : adoptante.entrySet()) {
            person = pers.getValue();
            System.out.println("DNI: " + person.getDni() + " - Apellido: " + person.getApellido() + " -  Nombre: " + person.getNombre());
        }
    }

    public static void listaPerrosDisponibles(TreeMap<Integer, Perro> jauria) {
        Integer dni;
        Perro perrito;
        for (Map.Entry<Integer, Perro> per : jauria.entrySet()) {
            perrito = per.getValue();
            System.out.println("Id:  " + perrito.getId() + " - Nombre: " + perrito.getNombre() + " -  Raza: "
                    + perrito.getRaza() + " - Tamaño: " + perrito.getTamanio() + "  Edad:" + perrito.getEdad());
        }
    }

    public static void adoptarPerro(TreeMap<Integer, Persona> adoptante, TreeMap<Integer, Perro> jauria, TreeMap<Integer, Persona> adoptado) {
//        Persona persona = new Persona();
//        Perro cane = new Perro();
//        ArrayList<Perro> perro1 = new ArrayList<>();
//        ArrayList<Perro> perro2 = new ArrayList<>();
        Integer dniAdoptante, idPerro;

        System.out.println("\nADOPTAR PERRO");
        System.out.println("------------------------\n");
        do {

            Persona persona = new Persona();
            Perro cane = new Perro();
            ArrayList<Perro> perro1 = new ArrayList<>();
            ArrayList<Perro> perro2 = new ArrayList<>();
            perro1.clear();

            System.out.print("Ingrese DNI del adoptante (0 para salir): ");
            dniAdoptante = read.nextInt();
            //  System.out.println(adoptante);

            if (adoptante.containsKey(dniAdoptante)) {

                persona = adoptante.get(dniAdoptante);

                //ArrayList<Perro> perrosAdoptados = null; //para traer la cantidad de perros que tiene adoptado el dueño
                System.out.println("Apellido y Nombre:" + persona.getApellido() + " " + persona.getNombre());
                System.out.print("Id del perro a adoptar: ");
                idPerro = read.nextInt();
                if (jauria.containsKey(idPerro)) {

                    cane = jauria.get(idPerro);
                    System.out.print("Felicitaciones, usted ha adoptado a " + cane.getNombre() + ". raza " + cane.getRaza() + "  pulse ENTER para continuar");
                    read.next();

                    //Persona persona1 = new Persona(persona.getNombre(), persona.getApellido(), persona.getDni());
                    if (persona.getPerro() != null) {
                        perro1.addAll(persona.getPerro());
                    }
                    perro2.clear();
                    perro2.addAll(perro1);
                    perro2.add(cane);
                    persona.setPerro(perro2);
                    adoptante.put(dniAdoptante, persona);

                    adoptado.put(dniAdoptante, persona);

                    jauria.remove(idPerro);
                    //System.out.println("persona" + persona.toString());

                } else {
                    System.out.print("Ese perro no existe en la base de datos, o fue adoptado. Pulse ENTER para continuar");
                    read.next();
                }

            } else {
                if (dniAdoptante != 0) {
                    System.out.print("No existe la el DNI cargado, intente con otro - PULSE ENTER para continuar");
                    read.next();
                }
            }
        } while (dniAdoptante != 0);

    }

    public static void listaAdoptados(TreeMap<Integer, Persona> adoptado) {
        System.out.println("LISTADO DE ADOPCIONES \n" + adoptado);
    }
}
