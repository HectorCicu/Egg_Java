package AlumnoService;

import Alumno.Alumno_Map;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.Map;
import java.util.Objects;

import java.util.Random;

import java.util.Scanner;

import java.util.TreeMap;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 *
 * @author Hector Cicutti
 */
public class AlumnoService_Map {

    /**
     * Crea el comparador personalizado en la clase para poder utilizar el
     * treeset con una clase
     */
    public static Comparator<Integer> ordenarLegajo = new Comparator<Integer>() {
        @Override
        public int compare(Integer a1, Integer a2) {
            return a1 - a2;

        }
    };

    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static TreeMap<Integer, Alumno_Map> al = new TreeMap<>(ordenarLegajo);
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
            Alumno_Map alu = new Alumno_Map(legajo, nom, doc);
            al.put(legajo, alu);
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
        ArrayList<Integer> notas = new ArrayList<>();
        boolean esta = false;
        System.out.print("Ingrese el legajo del alumno: ");
        legaj = read.nextInt();

        for (Map.Entry<Integer, Alumno_Map> entry : al.entrySet()) {
            Alumno_Map nn = entry.getValue();
            if (Objects.equals(nn.getLegajo(), legaj)) { // leo el legajo de la clase alumno del Treemap que está corriendo.

                esta = true;
                for (int i = 1; i < 4; i++) {
                    System.out.print("Ingrese nota (" + i + " de " + " 3) : ");
                    do {
                        not = read.nextInt();
                    } while (not < 0 || not > 10);
                    notas.add(not);
                }
                nn.setNota(notas);

                entry.setValue(nn);                      //notas);//.setNota(notas);

            }
            //            

        }
        if (!esta) {
            System.out.println("\nEl legajo no existe en la base de datos del colegio\n");
        }
    }

    public static void mostrarAlumnos() {  //convertirlo en una funcion y devolver la posición en el array
        //TODO
        for (Map.Entry<Integer, Alumno_Map> entry : al.entrySet()) {
            System.out.println(entry.toString());

        }
    }

    public static void cargarVariosAlumnos(int cant) {
        Integer lega;
        for (int i = 1; i <= cant; ++i) {
            lega = rand.nextInt(1000, 9999);
            al.put(lega, new Alumno_Map(lega, "Fer Chiquito" + rand.nextInt(1, 50), rand.nextInt(10000000, 50000000)));
        }
    }

    public static void promedioNotas() {
        Integer legaj, acumulada = 0;
        double not;

        ArrayList<Integer> notas = new ArrayList<>();
        Integer[] notAcum = new Integer[3];
        boolean esta = false;
        System.out.print("Ingrese el legajo del alumno: ");
        legaj = read.nextInt();
        for (Map.Entry<Integer, Alumno_Map> entry : al.entrySet()) {
            Alumno_Map nn = entry.getValue();
            if (Objects.equals(nn.getLegajo(), legaj)) { // leo el legajo de la clase alumno del Treemap que está corriendo.

                esta = true;
                notas = nn.getNota();

                for (int i = 0; i < 3; i++) {
                    acumulada += notas.get(i);
                }

            }
        }
        if (esta) {
          
            System.out.println("La nota promedio del alumno es. " + (double) (acumulada.doubleValue() / 3));
           
        } else {
              System.out.println("\nEl legajo no existe en la base de datos del colegio\n");
        }
    }

    public static void cargaNotasMasiva() {

        for (Map.Entry<Integer, Alumno_Map> entry : al.entrySet()) {
            Alumno_Map nn = entry.getValue();
            ArrayList<Integer> not = new ArrayList<>();
            for (int i = 1; i < 4; i++) {
                not.add(rand.nextInt(0, 11));
            }
            nn.setNota(not);
            entry.setValue(nn);

        }
    }
}
