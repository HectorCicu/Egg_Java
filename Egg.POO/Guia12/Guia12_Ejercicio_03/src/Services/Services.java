

package Services;

import Entities.Electrodomestico;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class Services {
Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static ArrayList<Electrodomestico> electro = new ArrayList<>();
//    private static ArrayList<Lavadora> lava = new ArrayList<>();
//    private static ArrayList<Televisor> tele = new ArrayList<>();

    boolean salir = false;

    public void menu() {
        do {
            System.out.println("""
                           \nOPCIONES
                           --------------
                           1- Cargar  Lavadoras
                           2- Cargar Televisores
                           3- Listar Artículos
                           4- Salir""");

            System.out.print("Opcion: ");
            int opc = read.nextInt();
            switch (opc) {
                case 1 ->
                    electro.addAll(LavadoraService.crearLavadoras());
                // electro.add(new Lavadora(30, 3000.0, BLANCO, F, 17.0));

                case 2 ->
                    electro.addAll(TelevisorService.crearTelevisores());

                case 3 ->
                    listarArticulos(electro);
                case 4 ->
                    salir = true;
                default ->
                    System.out.println("Opción incorrecta");
            }
            // System.out.println("lavadd" + lava.toString());
        } while (!salir);
    }

    public static void listarArticulos(ArrayList<Electrodomestico> elec) {
        Double total=0.;
        System.out.println("""
                           LISTADO DE ELECTRODOMESTICOS
                           ----------------------------------------------""");
        for (Electrodomestico electrodomestico : elec) {
            System.out.println("" + electrodomestico.toString());
            total += electrodomestico.getPrecio();
        }
        System.out.println("\nValor Total de los Electrodomésticos $" + total);
    }
}
