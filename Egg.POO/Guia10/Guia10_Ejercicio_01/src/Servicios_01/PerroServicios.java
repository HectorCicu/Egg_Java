package Servicios_01;

import Perro.Perro;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class PerroServicios {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Perro> perros = new ArrayList<>();

    public void agregarPerro(Perro p) {
        perros.add(p);

    }

    public void Cargarperro() {

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese la raza del perro: ");
            String raza = read.next();
            String respuesta;
            agregarPerro(new Perro(raza));
            do {
                System.out.print("Desea ingresar otra raza de perro? S/N: ");
                respuesta = read.next();
                if (respuesta.equalsIgnoreCase("N")) {
                    continuar = false;
                }
            } while (!respuesta.equalsIgnoreCase("N") && !respuesta.equalsIgnoreCase("s"));
        }

        System.out.println("\nPerros Guardados");
        mostrarPerros();

    }

    public void eliminarPerro() {
        System.out.print("Ingrese la raza del perro que desea eliminar: ");
        String raz = read.next();
        boolean encontrada = false;
        Iterator<Perro> iterator = perros.iterator();

        while (iterator.hasNext()) {

            Perro p = iterator.next();

            if (p.getRaza().equalsIgnoreCase(raz)) {
                iterator.remove();
                encontrada = true;
            }

        }
        if (!encontrada) {
            System.out.println("LA RAZA " + raz + " NO SE ENCUENTRA EN LA LISTA");
        }

        System.out.println("\nLista Actualizada de perros");
        mostrarPerros();

    }

    public void mostrarPerros() {
        perros.sort(Perro.comparaRaza);
        for (Perro p : perros) {
            System.out.println(p.getRaza());
        }
    }

    /**
     *
     * @param cant cantidad de razas a crear (nombre raza + índice)
     */
    public void crearMuchasRazas(int cant) {
        for (int i = 0; i < cant; i++) {

            perros.add(new Perro(("raza" + i)));

        }
        mostrarPerros();
    }

}
