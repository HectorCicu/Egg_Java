package AlumnoService;

import Alumno.Alumno;
import java.util.Iterator;

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

    private static Scanner read = new Scanner(System.in).useDelimiter("\n");
    private static TreeSet<Alumno> al = new TreeSet<>();

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

            al.add(new Alumno(legajo,nom, doc));
            System.out.print("\n Continua? (S/N)> ");
            opcion = read.next().charAt(0);

            if (Character.toUpperCase(opcion) == 'N') {
                continua = true;
            }
        } while (!continua);
    }

    public static void menuPrincipal() {
        int opcion;
        boolean continua = true;
        System.out.print("""
                         MENU PRINCIPAL
                         --------------
                         1) Cargar Alumnos
                         2) Cargar Notas
                         3) Visualizar Alumnos
                         4) Promedio de un alumno
                         5) Salir
                         Opcion: """);
        do {
            opcion = read.nextInt();
        } while (opcion < 1 || opcion > 5);

        switch (opcion) {
            case 1 -> {
                altaAlumno();
            }
            case 2 -> {
                cargarNota();
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 ->
                continua = false;

        }

    }

    public static void cargarNota() {  //TODO
        Integer not;
        for(int i = 1; i <4 ;i++) {
            System.out.print("Ingrese nota (" + i +" de " + " 3) : ");
            do{
                not = read.nextInt();
            } while(not < 0 || not > 10);
            
              
        }
    }
    public static void buscarAlumnos(){
        //TODO
        Iterator<Alumno> it  = al.iterator();
        Integer legaj;
        System.out.print("Ingrese el legajo del alumno: ");
        legaj = read.nextInt();
        
        
        
    }
    
    public static void mostrarAlumnos(){  //convertirlo en una funcion y devolver la posición en el array
        //TODO
    }
}
