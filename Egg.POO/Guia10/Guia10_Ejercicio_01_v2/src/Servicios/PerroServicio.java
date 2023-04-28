package Servicios;

import Entidad.Perro;
import java.util.ArrayList;
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

            } while (sexo != 'M' && sexo != 'm' && sexo != 'H' && sexo != 'h');

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
            switch (colores) {
                case 1:
                    colo = "Blanco";
                    break;
                case 2:
                    colo = "Negro";
                    break;
                case 3:
                    colo = "Marron";
                    break;
                case 4:
                    colo = "Blanco y marron";
                    break;
                case 5:
                    colo = "Blanco y negro";
                    break;
                case 6:
                    colo = "Marron claro";
                    break;
                case 7:
                    colo = "Tricolor";
                    break;
                default:
                    colo = "Indefinido, soy daltonico";
                    break;
            }
            razas = rand.nextInt(1, 8);
            switch (colores) {
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
            mostrarPerro();
        }
    }
}
