package Servicios;

import Entidades.Alumnos;
import Entidades.Votado;
import Entidades.Voto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Hector Cicutti
 */
public class Simulador {

    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static Random rand = new Random();
    public static ArrayList<Integer> docu = new ArrayList<>();
    public static ArrayList<String> alu = new ArrayList<>();
    public static TreeMap<Integer, Alumnos> alum = new TreeMap<>();
    public static ArrayList<Voto> votos = new ArrayList<>();
    public static Comparator<Votado> ordenarVotos = (Votado v1, Votado v2) -> v2.getCantVotos().compareTo(v1.getCantVotos());
    public static ArrayList<Votado> votosTotales = new ArrayList<>(); // para acumular dni y votos
    public static ArrayList<Integer> dniVotados = new ArrayList<>(); // guardo todos los DNI de las votaciones, para usar luego el comando Frequiency

    /*
*La clase Simulador debe tener un método que genere un listado de alumnos
 * manera aleatoria y lo retorne. Las combinaciones de nombre y apellido deben
 * ser generadas de manera aleatoria. Nota: usar listas de tipo String para
 * generar los nombres y los apellidos.
     */
    public static void crearNombreAlumnos(int cant) {

        String nomb;
        int aux;
        String[] nombres = {"Javier Musto              ", "Jorge José González  ", "Luca Martinez Dupuy ", "Marco Ruben            ", "Angel Di María           ",
            "Aldo Pedro Poy         ", "Mario Alberto Kempes", "Omar Arnaldo Palma ", "Ángel Tulio Zoff         ", "Carlos Biasutto          "};
        for (int i = 0; i < cant; i++) {

            aux = rand.nextInt(0, 10);
            alu.add(nombres[aux] + i);
        }
        alumnos(alu, docu);
        imprimirAlumnos(alum);
        votacion(alum);
        recuento();
        muestraRecuento();
    }

    /*
Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
     */
    public static ArrayList<Integer> crearDniAlumnos(int cant) {

        for (int i = 0; i < cant; ++i) {
            docu.add(rand.nextInt(17000000, 44000000));
        }
        return docu;
    }

    /*
    Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre
     */
    public static TreeMap<Integer, Alumnos> alumnos(ArrayList<String> nombres, ArrayList<Integer> dni) {

        for (int i = 0; i < nombres.size(); i++) {

            alum.put(dni.get(i), new Alumnos(nombres.get(i), dni.get(i)));
        }
        return alum;
    }

    public static void imprimirAlumnos(TreeMap<Integer, Alumnos> alu) {
        System.out.println("""
                           LISTADO DE ALUMNOS
                           ------------------------------""");
//        for (Alumnos alumnos : alu) {
//            System.out.println("Documento: " + alumnos.getDni() + " - Nombre: " + alumnos.getNombreAlumno());
//        }
        for (Map.Entry<Integer, Alumnos> alumn : alu.entrySet()) {

            System.out.println("Documento: " + alumn.getValue().getDni() + " - Nombre: " + alumn.getValue().getNombreAlumno());

        }
    }

    /*
    Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto
     */
    public static void votacion(TreeMap<Integer, Alumnos> alumnos) {

        ArrayList<Integer> dnis = new ArrayList<>(alumnos.keySet());  //para incluir todos los dni en un arraylist. Puedo hacer shuffle para los votos

        Integer nroDni;

        int i;
        for (Map.Entry<Integer, Alumnos> alu1 : alumnos.entrySet()) {
            i = 1;
            ArrayList<Alumnos> alumnosVotados = new ArrayList<>();
            while (i <= 3) {
                Collections.shuffle(dnis);
                nroDni = dnis.get(rand.nextInt(0, dnis.size()));  //DNI VOTADO

                if (!alumnosVotados.contains(alumnos.get(nroDni))) {
                    if (!Objects.equals(alu1.getKey(), nroDni)) {
                        alumnosVotados.add(alumnos.get(nroDni));
                        i++;
                    }
                }
            }
            votos.add(new Voto(alu1.getValue(), alumnosVotados));
        }

    }

    /*
    Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
     */
    public static void recuento() {
        for (Voto voto : votos) {

            for (int i = 0; i < voto.getVotados().size(); i++) {
                dniVotados.add(voto.getVotados().get(i).getDni());
            }
        }

        for (Voto voto1 : votos) {
          //  System.out.println("voto alumno " + voto1.getAlumno().getDni());
           // System.out.println("frecuencia  " + Collections.frequency(dniVotados, voto1.getAlumno().getDni()));

            votosTotales.add(new Votado(voto1.getAlumno().getDni(),
                    Collections.frequency(dniVotados, voto1.getAlumno().getDni())));
        }
    }

    public static void muestraRecuento() {
        Collections.sort(votosTotales, ordenarVotos);
       // System.out.println("votado " + votosTotales.toString());

        System.out.println("\n\nORDEN DE VOTACIÓN\n");

        for (Votado votosTot : votosTotales) {

            System.out.print("Nombre :" + alum.get(votosTot.getDniVotado()).getNombreAlumno());
            System.out.print(" - DNI :" + alum.get(votosTot.getDniVotado()).getDni());
            System.out.println(" - Cantidad de Votos: " + votosTot.getCantVotos());

        }

    }
}
