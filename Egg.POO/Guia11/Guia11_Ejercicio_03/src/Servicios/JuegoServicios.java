package Servicios;

import Entidades.Barajas;
import Entidades.MazoBarajas;
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
    private static ArrayList<Barajas> cartasRestantes = new ArrayList<>();
    private static MazoBarajas ms = new MazoBarajas();
    private static MazoBarajas ms1 = new MazoBarajas();
    private static MazoBarajas ms2 = new MazoBarajas();
    private static Barajas baraja = new Barajas();
    private static Barajas barajabajada = new Barajas();
    private static Barajas barajarestante = new Barajas();

    public static void jugando() {

        Integer opc;
        generarCartas();  //inicializo las cartas
        barajar(carta);
do{
        System.out.println("""
                           JUGANDO CARTAS
                           ------------------------
                           1 - Barajar
                           2 - Pedir Cartas
                           3 - Próxima Carta
                           4 - Cartas en Mazo
                           5 - Cartas Bajadas
                           6 - Salir""");
        do {
            System.out.print("Elija la Opción: ");
            opc = read.nextInt();
        } while (opc < 1 && opc > 6);
        switch (opc) {
            case 1 ->
                barajar(carta);
            case 2 ->
                pedirCartas(carta);
        }
}while(opc != 6);
    }

    public static void generarCartas() {

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

    }

//    siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas
    public static void siguienteCarta(ArrayList<Barajas> cart) {
        System.out.println(cart.get(0).toString());
        cartasBajadas.add(cart.get(0));
        cart.remove(0);
    }

    public static void pedirCartas(ArrayList<Barajas> cart) {
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
        
        for(int i = 0 ; i < cant; ++i){
siguienteCarta(cart);
    }
   System.out.println("CARTAS EN EL MAZO " + cart);
        System.out.println("CARTAS BAJADAS " + cartasBajadas);
    }
}
