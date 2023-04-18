

package FechaServicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class FechaServicio {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {

        System.out.print("Ingrese día de nacimiento: ");
        int dia = read.nextInt();
        System.out.print("Mes de nacimiento: ");
        int mes = read.nextInt();
        System.out.print("Año de nacimiento: ");
        int anio = read.nextInt();

        return new Date(anio - 1900, mes - 1, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int diferencia(Date actual, Date nacim) {

        return Math.abs(actual.getYear() - nacim.getYear());
    }
}
