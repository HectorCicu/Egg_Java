package Servicios;

import Entidades.Barajas;
import Entidades.MazoBarajas;
import Entidades.YaBarajo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class JuegoServicios {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static Collections c;
    private static ArrayList<Barajas> cartasBajadas = new ArrayList<>();
    private static ArrayList<Barajas> carta = new ArrayList<>();
    private static MazoBarajas ms = new MazoBarajas();
    private static YaBarajo barajo = new YaBarajo();

    public static void jugando() {

        Integer opc;
        generarCartas();  //inicializo las cartas
        // barajar(carta);
        do {
            System.out.println("""
                           \nJUGANDO CARTAS
                           ------------------------
                           1 - Barajar
                           2 - Pedir Cartas
                           3 - Próxima Carta
                           4 - Cartas en Mazo
                           5 - Cartas Bajadas
                           6 - Cantidad de cartas disponibles
                           7 - Salir""");
            do {
                System.out.print("Elija la Opción: ");
                opc = read.nextInt();
            } while (opc < 1 && opc > 7);
            switch (opc) {
                case 1 ->
                    barajar(carta);
                case 2 ->
                    pedirCartas(carta, barajo);
                case 3 ->
                    pedirSiguienteCarta(carta, barajo);
                case 4 ->
                    mostrarBaraja(carta);
                case 5 ->
                    mostrarMonton(cartasBajadas);
                case 6 ->
                    cartasDisponibles(carta);
            }
        } while (opc != 7);
    }

    public static void generarCartas() {  //genero el mazo en el arraylist carta 

        String palo = "";
        for (int j = 1; j <= 4; j++) {
            switch (j) {
                case 1 ->
                    palo = "ORO";
                case 2 ->
                    palo = "ESPADA";
                case 3 ->
                    palo = "COPA";
                case 4 ->
                    palo = "BASTO";
            }

            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    carta.add(new Barajas(i, palo));
                }
            }
        }
        ms.setMazo(carta); // genero el mazo y lo instancio en la clase MazoBarajas
    }

    public static void barajar(ArrayList<Barajas> cart) {
        c.shuffle(cart);
        System.out.print("Cartas barajadas - pulse ENTER para continuar");
        read.next();
        boolean yalohizo = true;
        barajo.setBarajo(yalohizo);
    }

    public static void pedirSiguienteCarta(ArrayList<Barajas> cart, YaBarajo barajo) {
        if (barajo.getBarajo()) {
            siguienteCarta(cart, barajo);
            System.out.print("Carta Bajada - Pulse ENTER para Continuar");
            read.next();
        } else {
            System.out.print("Primero debe barajar cartas por lo menos una vez!!!!  -  pulse ENTER para continuar");
            read.next();
        }
    }
//    siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas

    public static void siguienteCarta(ArrayList<Barajas> cart, YaBarajo barajo) {
        if (barajo.getBarajo()) {

            System.out.println(cart.get(0).toString());  // control - sacarlo
            cartasBajadas.add(cart.get(0));  //agrego la primer carta del mazo al array de cartas bajadas
            cart.remove(0);  // borro el primer registro de CARTA para simular la bajada.
        } else {
            System.out.print("Primero debe barajar cartas por lo menos una vez!!!!  -  pulse ENTER para continuar");
            read.next();
        }
    }

    public static void pedirCartas(ArrayList<Barajas> cart, YaBarajo barajo) {
        if (barajo.getBarajo()) {
            Integer cant = 0;
            Boolean alcanza = true;
            do {
                System.out.print("Cantidad pedida: ");
                cant = read.nextInt();
                if (cant > cart.size()) {
                    System.out.println("\nLa cantidad solicitada supera a la del mazo -> " + cart.size() + "   Intente con otra cantidad\n");
                } else {
                    alcanza = true;
                }
            } while (!alcanza);

            for (int i = 0; i < cant; ++i) {
                siguienteCarta(cart, barajo);
            }
            cartasDisponibles(carta);
        } else {
            System.out.print("Primero debe barajar cartas por lo menos una vez!!!!  -  pulse ENTER para continuar");
            read.next();
        }
    }

// mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public static void mostrarBaraja(ArrayList<Barajas> cart) {
        System.out.println("CARTAS EN EL MAZO " + cart);
    }

//cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public static void mostrarMonton(ArrayList<Barajas> bajadas) {
        if (bajadas.isEmpty()) {
            System.out.print("Todavía no hay cartas bajadas- pulse ENTER para Continuar");
            read.next();
        } else {
            System.out.println("CARTAS BAJADAS " + bajadas);
        }
    }

    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public static void cartasDisponibles(ArrayList<Barajas> cart) {
        System.out.println("Quedan en el mazo " + cart.size() + " cartas.");
        System.out.print("Pulse ENTER para continuar");
        read.next();
    }
}
