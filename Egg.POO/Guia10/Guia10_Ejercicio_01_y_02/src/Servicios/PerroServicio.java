package Servicios;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class PerroServicio {

    private static Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro> p1 = new ArrayList<Perro>();
    ArrayList<String> raza = new ArrayList<String>();

    public void crearPerro() {
        boolean salir = false;
        Character sexo;
        do {
            System.out.print("Nombre del perro: ");
            String nombre = read.next();
            System.out.print("Raza: ");
            String raza = read.next();
            System.out.print("Edad: ");
            Integer edad = read.nextInt();
            System.out.print("Color: ");
            String color = read.next();

            do {
                System.out.print("Sexo (M)acho - (H)embra: ");
                sexo = read.next().charAt(0);

            } while (Character.toUpperCase(sexo) != 'M' && Character.toUpperCase(sexo) != 'H');

            this.raza.add(raza);

            p1.add(new Perro(nombre, raza, edad, color, Character.toUpperCase(sexo)));

            System.out.print("Carga otro? S/N: ");
            char sale = read.next().charAt(0);
            if (sale == 'N' || sale == 'n') {
                salir = true;
            }
        } while (!salir);
        mostrarPerro();
    }

    public void mostrarPerro() {
        System.out.println("\nMostrar Perros");
        for (Perro perro : p1) {
            System.out.println(perro.toString());

        }
    }

    /**
     * Creo una función para cargar muchos perros, con nombres similares pero
     * con números aleatorios. Agregué switch con randoms para razas y colores,
     * Edad, random hasta 12 años
     *
     * @param o
     */
    public void cargarMuchosPerros(int o) {
        Random rand = new Random();
        String nomb = "", raz = "", colo = "";
        Integer eda = 0;
        Character sex = 'M';
        int razas, colores;

        for (int i = 0; i < o; i++) {
            nomb = "Perro " + (i + rand.nextInt(1, 300));
            colores = rand.nextInt(1, 8);
            colo = switch (colores) {
                case 1 -> "Blanco";
                case 2 -> "Negro";
                case 3 -> "Marron";
                case 4 -> "Blanco y marron";
                case 5 -> "Blanco y negro";
                case 6 -> "Marron claro";
                case 7 -> "Tricolor";
                default -> "Indefinido, soy daltonico";
            };
            razas = rand.nextInt(1, 10);
            switch (razas) {
                case 1:
                    raz = "rottweiler";
                    break;
                case 2:
                    raz = "pastor aleman";
                    break;
                case 3:
                    raz = "gran danes";
                    break;
                case 4:
                    raz = "chihuahua";
                    break;
                case 5:
                    raz = "labrador";
                    break;
                case 6:
                    raz = "golden retriever";
                    break;
                case 7:
                    raz = "mastin napolitano";
                    break;
                case 8:
                    raz = "bulldog";
                    break;
                case 9:
                    raz = "boxer";
                    break;
                default:
                    raz = "Perro, perro";
                    break;
            }

            eda = rand.nextInt(1, 13);
            if (rand.nextInt() % 2 == 0) {
                sex = 'M';
            } else {
                sex = 'H';
            }
            this.raza.add(raz);

            p1.add(new Perro(nomb, raz, eda, colo, Character.toUpperCase(sex)));
        }
        mostrarPerro();
        System.out.println("");
    }

    public void eliminarPerro() {
        boolean existe = false;
        int opcion;
        Iterator<Perro> it = p1.iterator();
        System.out.print("\nNombre del perro a eliminar: ");
        String nomPerro = read.next();

        while (it.hasNext()) {
            Perro p = it.next();
            if (p.getNombre().equalsIgnoreCase(nomPerro)) {
                it.remove();
                existe = true;
            }
        }
        if (existe) {
            System.out.println("\nEl perro fue eliminado de la lista");
        } else {
            System.out.println("\nEl perro NO existe en la lista");
        }
        do {
            System.out.print("""
                           Ordena la lista por: 
                           1) Nombre
                           2) Raza
                           3) Edad
                           4) Sexo
                           -->   """);
            opcion = read.nextInt();
        } while (opcion < 1 && opcion > 4);
        switch (opcion) {
            case 1:
                p1.sort(Perro.comparaNombre);
                System.out.println("\n Se va a mostrar la lista ordenada por nombre \n");
                break;
            case 2:
                p1.sort(Perro.comparaRaza);
                System.out.println("\n Se va a mostrar la lista ordenada por raza \n");
                break;
            case 3:
                p1.sort(Perro.comparaEdad);
                System.out.println("\n Se va a mostrar la lista ordenada por edad \n");
                break;
            case 4:
                p1.sort(Perro.comparaSexo);
                System.out.println("\n Se va a mostrar la lista ordenada por sexo \n");
                break;
        }

        mostrarPerro();
        System.out.println("");
    }

}
