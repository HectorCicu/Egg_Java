package Services;

import java.util.Random;

/**
 *
 * @author Hector Cicutti
 */
public class AdditionalServices {

    private static final Random rand = new Random();

    public static int cantLimo() {
        return rand.nextInt(1, 13);
    }

    public static int cantSalonesConf() {
        return rand.nextInt(1, 11);
    }

    public static int cantSuites() {
        return rand.nextInt(1, 11);
    }

    public static int cantPisos() {
        return rand.nextInt(1, 23);
    }

    public static int cantHabitaciones() {
        return rand.nextInt(1, 9);
    }

    public static int cantCamas() {
        return rand.nextInt(1, 5);
    }

    public static boolean tieneGimnasio() {
        return rand.nextBoolean();
    }

    public static char claseGimnasio() {
        if (rand.nextBoolean()) {
            return 'A';
        }
        return 'B';
    }

    public static int capacidadRestaurant() {
        return rand.nextInt(40, 300);
    }

}
