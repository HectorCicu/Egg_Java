package Services;

import Entities.EmpleadoFacultad;
import Entities.Estudiante;
import Entities.PersonalDeServicio;
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
                case 1 ->  {
                    System.out.print("Cantidad de personas a crear: ");
                    int cant = read.nextInt();
                    personalFacu.addAll(AdditionalServices.crearEmpleado(cant / 3));
                    personalFacu.addAll(AdditionalServices.crearProfesor(cant / 3));
                    personalFacu.addAll(AdditionalServices.crearEstudiante(cant / 4));
                    personalFacu.addAll(AdditionalServices.crearPersonalDeServicio(cant * 2));
                }
                case 2 ->  {
                    listarEstudiantes();
                }
                case 3 ->  {
                    listarProfesores();
                }
                case 4 ->  {
                    listarEmpleados();
                }
                case 5 ->  {
                    listarPersonalDeServicio();
                }
                case 6 ->  {
                    salir = true;
                }
                case 7 ->  {
                    salir = true;
                }
                case 8 ->  {
                    salir = true;
                }
                default -> System.out.println("Opción incorrecta");
            }

        } while (!salir);

    }

    public static void listarEstudiantes() {
        for (PersonasFacultad personal : personalFacu) {
            if (personal instanceof Estudiante) {
                System.out.println("Estudiante: " + ((Estudiante) personal).getApellido() + " " + ((Estudiante) personal).getNombre() + " - DNI: " + ((Estudiante) personal).getId() + " - Materias: " + ((Estudiante) personal).getCursoAsignado() +" Estado Civil: " + ((Estudiante)personal).getEstadoCivil());
            }
        }
    }

    public static void listarProfesores() {
        for (PersonasFacultad personal : personalFacu) {
            if (personal instanceof Profesor) {
                System.out.println("Profesor: " + ((Profesor) personal).getApellido() + " " + ((Profesor) personal).getNombre() + " - DNI: " + ((Profesor) personal).getId() + " - Cátedra: " + ((Profesor) personal).getCatedra().getNombre()+" Estado Civil: " + ((Profesor)personal).getEstadoCivil());

            }

        }
    }
    public static void listarEmpleados() {
    for (PersonasFacultad personal : personalFacu) {
            if (personal instanceof EmpleadoFacultad) {
                System.out.println("Empleado: " + ((EmpleadoFacultad) personal).getApellido() + " " + ((EmpleadoFacultad) personal).getNombre() + " - DNI: " + ((EmpleadoFacultad) personal).getId() + " - Año de ingreso: " + ((EmpleadoFacultad) personal).getAnioIngreso()+" Estado Civil: " + ((EmpleadoFacultad)personal).getEstadoCivil());
            }

        }
    }
public static void listarPersonalDeServicio() {
    for (PersonasFacultad personal : personalFacu) {
            if (personal instanceof PersonalDeServicio) {
                System.out.println("Personal de Servicio: " + ((PersonalDeServicio) personal).getApellido() + " " + ((PersonalDeServicio) personal).getNombre() + " - DNI: " + ((PersonalDeServicio) personal).getId() + " - Sección Asignada: " + ((PersonalDeServicio) personal).getSeccion()+" Estado Civil: " + ((PersonalDeServicio)personal).getEstadoCivil());
            }

        }
    }
}

