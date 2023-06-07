package Services;

import Entities.Estudiante;
import Entities.PersonasFacultad;
import Entities.Profesor;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class ServicesFacultad {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public static AdditionalServices as = new AdditionalServices();
    public static ArrayList<PersonasFacultad> personalFacu = new ArrayList<>();

    public static void menu() {
        boolean salir = false;
        do {
            System.out.println("""
                           \nOPCIONES
                           --------------
                           1- Cargar Personal
                           2- Listar Estudiantes
                           3- Listar Profesores
                           4- Listar Empleados
                           5- Listar Personal de Servicio
                           6- Listar Personal de Servicio
                           7- Listar Personal de Servicio
                           8- Salir""");

            System.out.print("Opcion: ");
            int opc = read.nextInt();
            switch (opc) {
                case 1: {
                    System.out.print("Cantidad de personas a crear: ");
                    int cant = read.nextInt();
                    personalFacu.addAll(AdditionalServices.crearEmpleado(cant / 3));
                    personalFacu.addAll(AdditionalServices.crearProfesor(cant / 3));
                    personalFacu.addAll(AdditionalServices.crearEstudiante(cant / 4));
                    personalFacu.addAll(AdditionalServices.crearPersonalDeServicio(cant * 2));
                    break;
                }
                case 2: {
                    listarEstudiantes();
                    break;
                }
                case 3: {
                    listarProfesores();
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    salir = true;
                    break;
                }
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (!salir);

    }

    public static void listarEstudiantes() {
        for (PersonasFacultad personal : personalFacu) {
            if (personal instanceof Estudiante) {
                System.out.println("Estudiante: " + ((Estudiante) personal).getApellido() + " " + ((Estudiante) personal).getNombre() + " - DNI: " + ((Estudiante) personal).getId() + " - Materias: " + ((Estudiante) personal).getCursoAsignado());
            }
        }
    }

    public static void listarProfesores() {
        for (PersonasFacultad personal : personalFacu) {
            if (personal instanceof Profesor) {
                System.out.println("Profesor: " + ((Profesor) personal).getApellido() + " " + ((Profesor) personal).getNombre() + " - DNI: " + ((Profesor) personal).getId() + " - Cátedra: " + ((Profesor) personal).getCatedra().getNombre());

            }

        }
    }
}
