package AlumnoService;

import Alumno.Alumno;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 *
 * @author Hector Cicutti
 */
public class AlumnoService {

    /**
     * Crea el comparador personalizado en la clase para poder utilizar el
     * treeset con una clase
     */
    public static Comparator<Alumno> ordenarLegajo = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a1, Alumno a2) {
            return a1.getLegajo().compareTo(a2.getLegajo());

        }
    };

    private static Scanner read = new Scanner(System.in).useDelimiter("\n");
    private static TreeSet<Alumno> al = new TreeSet<>(ordenarLegajo);
    private static Random rand = new Random();

    public static void menuPrincipal() {
        int opcion;
        boolean continua = true;
        do {
            System.out.print("""
                         \nMENU PRINCIPAL
                         --------------
                         1) Cargar Alumnos individual
                         2) Cargar Notas
                         3) Visualizar Alumnos
                         4) Promedio de un alumno
                         5) Carga Masiva de alumnos (20)
                         6) Carga Masiva de Notas
                         7) Salir
                         Opcion: """);
            do {
                opcion = read.nextInt();
            } while (opcion < 1 || opcion > 7);

            switch (opcion) {
                case 1 -> {
                    altaAlumno();

                }
                case 2 -> {
                    cargarNota();
                }
                case 3 -> {
                    mostrarAlumnos();
                }
                case 4 -> {
                    promedioNotas();
                }
                case 5 -> {
                    cargarVariosAlumnos(20);
                }
                case 6 -> {
                    cargaNotasMasiva();
                }
                case 7 ->
                    continua = false;
            }
        } while (continua);
    }

    public static void altaAlumno() {

        char opcion;
        boolean continua = false;
        String nom;
        Integer doc;
        Integer legajo;
        System.out.println("\nCARGA DE ALUMNOS");
        do {
            System.out.print("Nro. Legajo: ");
            legajo = read.nextInt();
            System.out.print("Nombre Alumno: ");
            nom = read.next();
            System.out.print("Nro. DNI: ");
            doc = read.nextInt();

            al.add(new Alumno(legajo, nom, doc));
            System.out.print("\n Continua? (S/N)> ");
            opcion = read.next().charAt(0);

            if (Character.toUpperCase(opcion) == 'N') {
                continua = true;
            }
        } while (!continua);
        //     mostrarAlumnos();
    }

    public static void cargarNota() {  //TODO
        Integer legaj, not;
        Iterator<Alumno> it = al.iterator();
        ArrayList<Integer> notas = new ArrayList<>();
        boolean esta = false;
        // Integer existe;  // si encuentro número de legajo, lo reemplazo en este valor de retorno
        System.out.print("Ingrese el legajo del alumno: ");
        legaj = read.nextInt();
        while (it.hasNext()) {
            Alumno aa = it.next();
            if (Objects.equals(aa.getLegajo(), legaj)) {  //investigar sobre esta funcion
                esta = true;
                for (int i = 1; i < 4; i++) {
                    System.out.print("Ingrese nota (" + i + " de " + " 3) : ");
                    do {
                        not = read.nextInt();
                    } while (not < 0 || not > 10);
                    notas.add(not);
                }
                aa.setNota(notas);
            }
        }
        if (!esta) {
            System.out.println("\nEl legajo no existe en la base de datos del colegio\n");
        }
    }

    public static void mostrarAlumnos() {  //convertirlo en una funcion y devolver la posición en el array
        //TODO
        for (Alumno alumno : al) {
            System.out.println(alumno.toString());

        }
    }

    public static void cargarVariosAlumnos(int cant) {

        for (int i = 1; i <= cant; ++i) {
            al.add(new Alumno(rand.nextInt(1000, 9999), "Fer Chiquito" + rand.nextInt(1, 50), rand.nextInt(10000000, 50000000)));
        }
    }

    public static void promedioNotas() {
        Integer legaj, acumulada = 0;
        double not;
        Iterator<Alumno> it = al.iterator();
        ArrayList<Integer> notas = new ArrayList<>();
        Integer[] notAcum = new Integer[3];
        boolean esta = false;
        System.out.print("Ingrese el legajo del alumno: ");
        legaj = read.nextInt();
        while (it.hasNext()) {
            Alumno aa = it.next();
            if (Objects.equals(aa.getLegajo(), legaj)) {  //investigar sobre esta funcion
                esta = true;
                notas = aa.getNota();

                for (int i = 0; i < 3; i++) {
                    acumulada += notas.get(i);
                }

            }
        }
        if (!esta) {
            System.out.println("\nEl legajo no existe en la base de datos del colegio\n");
        } else {
            System.out.println("La nota promedio del alumno es. " + (double) ( acumulada.doubleValue() / 3));
        }
    }

    public static void cargaNotasMasiva() {

        for (Alumno alumno : al) {
            ArrayList<Integer> not = new ArrayList<>();
            for (int i = 1; i < 4; i++) {
                not.add(rand.nextInt(0, 11));
            }
            alumno.setNota(not);

        }
    }
}
