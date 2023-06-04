package Services;

import Entities.Alojamiento;
import Entities.Camping;
import Entities.Hotel;
import Entities.Hotel4;
import Entities.Hotel5;
import Entities.Residencia;
import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class AlojamientoServices {

    private static final DecimalFormat df = new DecimalFormat("###,###,###.00");
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public static AdditionalServices as = new AdditionalServices();
    public static ArrayList<Alojamiento> alojamientos = new ArrayList<>();
    public static ArrayList<Hotel> hotel = new ArrayList<>();

    public static void menu() {
        boolean salir = false;
        do {
            System.out.println("""
                           \nOPCIONES
                           --------------
                           1- Cargar  Alojamientos
                           2- Listar Alojamientos
                           3- Listar Hoteles por valor de habitación
                           4- Listar Campings con restaurantes
                           5- Listar Residencias con descuentos
                           6- Salir""");

            System.out.print("Opcion: ");
            int opc = read.nextInt();
            switch (opc) {
                case 1: {
                    System.out.print("Cantidad de alojamientos a crear: ");
                    int cant = read.nextInt();
                    alojamientos.addAll(crearHotelFive(cant));
                    alojamientos.addAll(crearHotelFour(cant));
                    alojamientos.addAll(crearCamping(cant));
                    alojamientos.addAll(crearResidencia(cant));
                    break;
                }
                case 2: {
                    listarAlojamientos();
                    break;
                }
                case 3: {
                    listarHotelesPorValor();
                    break;
                }
                case 4: {
                    listarCampingConRestaurant();
                    break;
                }
                case 5: {
                    listarResidenciasConDescuento();
                    break;
                }
                case 6: {
                    salir = true;
                    break;
                }
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (!salir);

    }

    public static ArrayList<Alojamiento> crearHotelFive(int cantidad) {
        ArrayList<Alojamiento> hotelFive = new ArrayList<>();
        char claseGym = ' ';
        for (int i = 0; i < cantidad; i++) {
            int habitac = as.cantHabitaciones();
            int camas = as.cantCamas();
            int pisos = as.cantPisos();
            boolean gym = as.tieneBoolean();
            claseGym = (gym) ? as.claseGimnasio() : ' ';
            int comensales = as.capacidadRestaurant();
            int suites = as.cantSuites();
            int limos = as.cantLimusinas();
            Double precioHabit = precioHabitacion(suites, habitac, camas, pisos, limos, claseGym, comensales);

            hotelFive.add(new Hotel5(suites, as.cantSalonesConf(), limos, as.nombreRestaurant(), comensales, as.tieneBoolean(), claseGym, habitac, camas, pisos, precioHabit, as.nombreHotel(), as.direccion(), as.nombreGerente(), as.localidad()));

        }
        return hotelFive;
    }

    public static ArrayList<Alojamiento> crearHotelFour(int cantidad) {
        ArrayList<Alojamiento> hotelFour = new ArrayList<>();
        char claseGym = ' ';
        for (int i = 0; i < cantidad; i++) {
            int habitac = as.cantHabitaciones();
            int camas = as.cantCamas();
            int pisos = as.cantPisos();
            boolean gym = as.tieneBoolean();
            claseGym = (gym) ? as.claseGimnasio() : ' ';
            int comensales = as.capacidadRestaurant();
            int suites = as.cantSuites();
            int limos = as.cantLimusinas();
            double precioHabit = precioHabitacion(0, habitac, camas, pisos, 0, claseGym, comensales);

            hotelFour.add(new Hotel4(as.nombreRestaurant(), comensales, gym, claseGym, habitac, camas, pisos, precioHabit, as.nombreHotel(), as.direccion(), as.nombreGerente(), as.localidad()));
        }
        return hotelFour;
    }

    public static ArrayList<Alojamiento> crearCamping(int cantidad) {
        ArrayList<Alojamiento> camping = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {

            camping.add(new Camping(as.cantCarpas(), as.cantBanos(), as.tieneBoolean(), as.tieneBoolean(), as.metrosCuadrados(), as.nombreHotel(), as.direccion(), as.nombreGerente(), as.localidad()));

        }
        return camping;
    }

    public static ArrayList<Alojamiento> crearResidencia(int cantidad) {
        ArrayList<Alojamiento> residencia = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {

            residencia.add(new Residencia(as.cantHabitaciones(), as.tieneBoolean(), as.tieneBoolean(), as.tieneBoolean(), as.metrosCuadrados(), as.nombreHotel(), as.direccion(), as.nombreGerente(), as.localidad()));
        }
        return residencia;
    }

    public static double precioHabitacion(int suites, int habitac, int camas, int pisos, int limos, char claseGym, int comensales) {
        int valorAgRestaurant, valorAgGym;
        if (comensales < 30) {
            valorAgRestaurant = 10;
        } else if (comensales <= 50) {
            valorAgRestaurant = 30;
        } else {
            valorAgRestaurant = 50;
        }
        switch (claseGym) {
            case 'A' ->
                valorAgGym = 50;
            case 'B' ->
                valorAgGym = 30;
            default ->
                valorAgGym = 0;
        }
        return 50 + ((suites + habitac) * camas * 2 * pisos) + valorAgRestaurant + valorAgGym;
    }

    public static void listarAlojamientos() {

        for (Alojamiento alo : alojamientos) {
            if (alo instanceof Hotel5) {
                System.out.println("Hotel 5 Estrellas. Nombre: " + alo.getNombre() + "  - direc " + alo.getDireccion() + "  - gerente " + alo.getNombreGerente() + "  - habitac " + ((Hotel5) alo).getHabitaciones() + "  - Pisos " + ((Hotel5) alo).getCantPisos() + "  - limos " + ((Hotel5) alo).getCantLimusinas() + "  - suites " + ((Hotel5) alo).getCantSuites() + "  - " + df.format(((Hotel) alo).getPrecioHabit()));
            } else if (alo instanceof Hotel4) {
                System.out.println("Hotel 4 Estrellas. Nombre: " + alo.getNombre() + "  - " + alo.getDireccion() + "  - " + alo.getNombreGerente() + "  - " + ((Hotel4) alo).getHabitaciones() + "  - Pisos " + ((Hotel4) alo).getCantPisos() + "  - " + df.format(((Hotel) alo).getPrecioHabit()));
            } else if (alo instanceof Camping) {
                System.out.println(alo.toString());
            } else if (alo instanceof Residencia) {
                System.out.println(alo.toString());
            }
        }
    }

    public static void listarHotelesPorValor() {
        hotel.clear();
        int i = 0;
        for (Alojamiento alo : alojamientos) {
            if (alo instanceof Hotel) {
                hotel.add((Hotel) alo);
            }
        }

        Collections.sort(hotel, (h1, h2) -> Double.compare(h2.getPrecioHabit(), h1.getPrecioHabit()));
        System.out.println("\nHoteles por precio");

        for (Alojamiento h : hotel) {
            System.out.println("Hotel:  " + ((Hotel) h).getNombre() + "  - Localidad: " + ((Hotel) h).getLocalidad() + "   - Precio Habitación $ :" + ((Hotel) h).getPrecioHabit());

        }
    }

    public static void listarCampingConRestaurant() {
        System.out.println("\nCAMPING CON RESTAURANTES");
        for (Alojamiento aloj : alojamientos) {
            if (aloj instanceof Camping) {
                if (((Camping) aloj).isTieneRestaurant()) {
                    System.out.println("Nombre Camping:  " + ((Camping) aloj).getNombre() + "  - Dirección: " + ((Camping) aloj).getLocalidad() + "  - Localidad: " + ((Camping) aloj).getLocalidad());

                }
            }
        }
    }

    public static void listarResidenciasConDescuento(){
        System.out.println("\nRESIDENCIAS CON DESCUENTOS A GREMIOS");
        for (Alojamiento resid : alojamientos) {
            if (resid instanceof Residencia) {
                if (((Residencia) resid).isDescuentoGremios()) {
                    System.out.println("Nombre Residencia:  " + ((Residencia) resid).getNombre() + "  - Dirección: " + ((Residencia) resid).getLocalidad() + "  - Localidad: " + ((Residencia) resid).getLocalidad());

                }
            }
        }
    }

}
