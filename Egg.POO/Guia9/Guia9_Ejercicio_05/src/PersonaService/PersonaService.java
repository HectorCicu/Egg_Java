package PersonaService;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 * a) Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la
 * persona a crear. Retornar el objeto Persona creado. b) Método calcularEdad
 * que calcule la edad del usuario utilizando el atributo de fecha de nacimiento
 * y la fecha actual. c) Método menorQue recibe como parámetro una Persona y una
 * edad. Retorna true si la persona es menor que la edad consultada o false en
 * caso contrario. d) Método mostrarPersona que muestra la información de la
 * persona deseada.
 *
 * @author Temporal
 */
public class PersonaService {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    // a)

    /**
     * Este método crea la persona. 
     *
     * @return Nueva clase de persona
     *
     */
    public Persona crearPersona() {
        System.out.print("Ingrese Nombre: ");
        String nombre = read.next();

        System.out.print("Día de Nacimiento: ");
        int dia = read.nextInt();
        System.out.print("Mes de Nacimiento: ");
        int mes = read.nextInt();
        System.out.print("Año de Nacimiento: ");
        int anio = read.nextInt();
        Date nac = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, nac);

    }

    /**
     * Calcula la edad de la persona. Para ello toma la diferencia en
     * milisegundos entre la fecha del día y la fecha de nacimiento. Luego la
     * convierte a años, dividiendo los milisegundos resultantes por la cantidad
     * de milisegundos que tiene un año (31.536.000.000 aprox). Para poder
     * tomarlo, primero castea la diferencia de milisegundos en double, para que
     * tome decimales, luego la divide por el total de ms en un año,
     * descompuesto en dos partes (equivalente a 31536 * 1000000 = 31536000000)
     * y toda esa operación termina casteando en int para que tome la cantidad
     * de años sin decimales
     *
     * @param p  Objeto de la clase Persona
     * @return Edad de la persona
     */
    public int edadPersona(Persona p) {

        Date hoy = new Date();
        Date fechaNac = p.getFecNac();
        long difMiliSec = hoy.getTime() - fechaNac.getTime();
        int edad = (int) ((double) difMiliSec / 1000000 / 31536);

        return edad;
    }

    /**
     * determina si es mayor de edad
     *
     * @param p (no se usa, pero lo pide el ejercicio)
     * @param edad
     * @return true si es igual o mayor de 18, false si es menor
     */
    public boolean esMayor(Persona p, int edad) {
        return (edad >= 18);
    }

    /**
     * Muestra los datos de la persona, calcula la edad y determina si es mayor de edad
     * llamando a los métodos correspondientes.
     * @param p 
     */
    public void mostrarPersona(Persona p) {
        Date fechaNa = p.getFecNac();
        int edad = edadPersona(p);
        System.out.println("\nDatos Personales");
        System.out.println("----------------");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de Nacimiento: " + fechaNa.getDate() + "/" + (fechaNa.getMonth() + 1) + "/" + (fechaNa.getYear() + 1900));
        System.out.println("Edad: " + edad + " años");
    /**
     * en este if llamo al método esMayor, para que devuelva el booleano, 
     * determinando si es o no mayor de edad (true o false)
     */
        if (esMayor(p, edad)) {
            System.out.println("La persona es Mayor de Edad\n");

        } else {
            System.out.println("La persona es menor de edad\n");
        }
    }
}
