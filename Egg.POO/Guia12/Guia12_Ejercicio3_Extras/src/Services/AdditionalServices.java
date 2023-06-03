package Services;

import java.util.Random;

/**
 *
 * @author Hector Cicutti
 */
public class AdditionalServices {

    private static final Random rand = new Random();

    public  int cantLimusinas() {
        return rand.nextInt(1, 13);
    }

    public  int cantSalonesConf() {
        return rand.nextInt(1, 11);
    }

    public  int cantSuites() {
        return rand.nextInt(1, 11);
    }

    public  int cantPisos() {
        return rand.nextInt(1, 23);
    }

    public  int cantHabitaciones() {
        return rand.nextInt(1, 9);
    }

    public  int cantCamas() {
        return rand.nextInt(1, 5);
    }

    public  boolean tieneBoolean() {
        return rand.nextBoolean();
    }

    public  char claseGimnasio() {
        if (rand.nextBoolean()) {
            return 'A';
        }
        return 'B';
    }

    public  int capacidadRestaurant() {
        return rand.nextInt(40, 300);
    }

    public  String nombreRestaurant() {
        int aux = rand.nextInt(1, 6);
        String nomRest = "";
        switch (aux) {
            case 1 ->
                nomRest = ("Le milanese " + aux);
            case 2 ->
                nomRest = ("Le pure de papa " + aux);
            case 3 ->
                nomRest = ("El vacío jugoso  " + aux);
            case 4 ->
                nomRest = ("El Formaggio triste " + aux);
            case 5 ->
                nomRest = ("Todo lo bueno " + aux);
        }
        return nomRest;
    }

    public  String nombreHotel() {
        int aux = rand.nextInt(1, 6);
        String nomHotel = "";
        switch (aux) {
            case 1 ->
                nomHotel = ("Excelsior " + aux);
            case 2 ->
                nomHotel = ("Presidente " + aux);
            case 3 ->
                nomHotel = ("Hyatt  " + aux);
            case 4 ->
                nomHotel = ("Hilton " + aux);
            case 5 ->
                nomHotel = ("Spartacus " + aux);
        }
        return nomHotel;

    }

    public  String nombreGerente() {
        int aux = rand.nextInt(1, 7);
        String nomGerente = "";
        switch (aux) {
            case 1 ->
                nomGerente = ("fernando Chiquito " + aux);
            case 2 ->
                nomGerente = ("Lola Rodriguez " + aux);
            case 3 ->
                nomGerente = ("Bart Simpson  " + aux);
            case 4 ->
                nomGerente = ("Humberto Fanto " + aux);
            case 5 ->
                nomGerente = ("Martha Garsis " + aux);
            case 6 ->
                nomGerente = ("Elvira Cimagona " + aux);
        }
        return nomGerente;

    }

    public  String direccion() {
        int aux = rand.nextInt(1, 7);
        String direccionHotel = "";
        switch (aux) {
            case 1 ->
                direccionHotel = ("Av. Siempre Viva " + aux);
            case 2 ->
                direccionHotel = ("Segurola y Habana " + aux);
            case 3 ->
                direccionHotel = ("Calle Elm  " + aux);
            case 4 ->
                direccionHotel = ("Boulevard Avellaneda " + aux);
            case 5 ->
                direccionHotel = ("Zona Rural " + aux);
            case 6 ->
                direccionHotel = ("Avenida Italia " + aux);
        }
        return direccionHotel;

    }

    public  String localidad() {
        int aux = rand.nextInt(1, 7);
        String localidad = "";
        switch (aux) {
            case 1 ->
                localidad = ("Capital Federal " + aux);
            case 2 ->
                localidad = ("Venado Tuerto " + aux);
            case 3 ->
                localidad = ("Tancacha " + aux);
            case 4 ->
                localidad = ("Colonia Liebig " + aux);
            case 5 ->
                localidad = ("Trelew " + aux);
            case 6 ->
                localidad = ("San Miguel de Tucumán " + aux);
        }
        return localidad;
    }
    public  int cantCarpas() {
        return rand.nextInt(30,500);
    }
    
    public  int cantBanos() {
        return rand.nextInt(10,50);
    }
    public  int metrosCuadrados() {
        return rand.nextInt(10000,50000);
    }
    
    public  int habitacionesResidencia() {
        return rand.nextInt(30,80);
    }
    
    public  double precioHabitacion(){
        return rand.nextDouble(3000., 14000.);
    }
    
}
