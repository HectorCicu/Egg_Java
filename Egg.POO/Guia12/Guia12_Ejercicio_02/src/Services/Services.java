

package Services;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class Services {
Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static ArrayList<Electrodomestico> electro = new ArrayList<>();
    private static ArrayList<Lavadora> lava = new ArrayList<>();
    private static ArrayList<Televisor> tele = new ArrayList<>();

    boolean salir = false;

    public void menu() {
        do {
            System.out.println("""
                           \nOPCIONES
                           --------------
                           1- Ingresar Lavadora
                           2- Ingresar Televisor
                           3- Listar Artículos
                           4- Salir""");

            System.out.print("Opcion: ");
            int opc = read.nextInt();
            switch (opc) {
                case 1 ->
                    lava.add(LavadoraService.crearLavadora());
                // electro.add(new Lavadora(30, 3000.0, BLANCO, F, 17.0));

                case 2 ->
                    tele.add(TelevisorService.crearTelevisor());

                case 3 ->
                    listarArticulos();
                case 4 ->
                    salir = true;
                default ->
                    System.out.println("Opción incorrecta");
            }
            // System.out.println("lavadd" + lava.toString());
        } while (!salir);
    }

    public static void listarArticulos() {
        String tiene;
        System.out.println("""
                       \nLISTADO DE LAVARROPAS
                       ----------------------------------""");
        for (Lavadora lav : lava) {
            System.out.printf("Carga:  %d kgs.   - Color:  %s - Tipo Consumo:  %s - Peso:  %f  - Precio $  %f", lav.getCarga(), lav.getColor(), lav.getConsumo(),
                    lav.getPeso(), lav.getPrecio());
            System.out.println("");

        }
        System.out.println("""
                       \nLISTADO DE TELEVISORES
                       ----------------------------------""");
        for (Televisor tv : tele) {
            if (tv.getSintoTDC()) {
                tiene = "SI";
            } else {
                tiene = "NO";
            }
            System.out.printf("Pulgadas " + tv.getPulgadas()+ " -  Tipo Consumo: " + tv.getConsumo() + "  -  Peso: " +  tv.getPeso() + " kgs. -  Sintonizador TDC: " +  tiene + " -  Precio $  " +  tv.getPrecio());
            System.out.println("");
        }
    }
}
