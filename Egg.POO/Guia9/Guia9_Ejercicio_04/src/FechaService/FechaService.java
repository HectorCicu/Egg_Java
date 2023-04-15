package FechaService;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class FechaService {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    /*
    Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
     */
    public Date fechaNacimiento() {

        System.out.print("Día de Nacimiento: ");
        int dia = read.nextInt();
        System.out.print("Mes de Nacimiento: ");
        int mes = read.nextInt();
        System.out.print("Año de Nacimiento: ");
        int anio = read.nextInt();

        return new Date(anio - 1900, mes - 1, dia);
    }

    /*
    Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
     */

    public Date fechaActual() {
        return new Date();
    }

    /*
    c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
     */
    public int anios(Date d1, Date d2) {

        return (d1.getYear() - d2.getYear());
    }
}
