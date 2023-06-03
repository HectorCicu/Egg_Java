package Services;

import Entities.Alojamiento;
import Entities.Hotel;
import Entities.Hotel5;

import java.util.ArrayList;

/**
 *
 * @author Hector Cicutti
 */
public class AlojamientoServices {

    public static AdditionalServices as = new AdditionalServices();
    public static final double COSTO = 10;
    public static ArrayList<Alojamiento> hotelFive = new ArrayList<>();
    public static ArrayList<Alojamiento> hotelFour = new ArrayList<>();
    public static ArrayList<Alojamiento> camping = new ArrayList<>();
    public static ArrayList<Alojamiento> residencia = new ArrayList<>();

    public static void crearHotelFive() {
        char claseGym = ' ';
        for (int i = 0; i < 10; i++) {
            int habitac = as.cantHabitaciones();
            int camas = as.cantCamas();
            int pisos = as.cantPisos();
            boolean gym = as.tieneBoolean();
            claseGym = (gym) ? as.claseGimnasio() : ' ';
            int comensales = as.capacidadRestaurant();
//        String nombreResto = (tieneResto)?as.nombreRestaurant():"";
            int suites = as.cantSuites();
            int limos = as.cantLimusinas();
            double precioHabit = precioHabitacion(suites, habitac, camas, pisos, limos, claseGym, comensales);

            hotelFive.add(new Hotel5(suites, as.cantSalonesConf(), limos, as.nombreRestaurant(), comensales, as.tieneBoolean(), claseGym, habitac, camas, pisos, precioHabit, as.nombreHotel(), as.direccion(), as.nombreGerente(), as.localidad()));

        }
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

    public static void imprimirHotelFive(){
        for (Alojamiento alojamiento : hotelFive) {
            System.out.println("" + alojamiento.getDireccion() +" " + alojamiento.getNombreGerente()+" " + alojamiento.getNombre()+" " + alojamiento.getLocalidad());
            System.out.println("" + alojamiento.toString());
            System.out.println("" + ((Alojamiento) alojamiento).getNombre());
            System.out.println("" + ((Hotel) alojamiento).getPrecioHabit());
        }
        System.out.println(hotelFive.toString());
    }
}
