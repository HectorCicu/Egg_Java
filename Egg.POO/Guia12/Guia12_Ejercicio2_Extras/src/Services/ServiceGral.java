package Services;

import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class ServiceGral {

    public static ArrayList<Edificio> ed = new ArrayList<>();
    public static ArrayList<Edificio> edo = new ArrayList<>();
    public static ArrayList<Edificio> poli = new ArrayList<>();
    public static final Random rand = new Random();
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    int opc;
    boolean salir = false;

    public void menu() {

        do {
            System.out.println("""
                           \nOPCIONES
                           --------------
                           1- Cargar  Polideportivos
                           2- Cargar Edificios de Oficinas
                           3- Listar 
                           4- Salir""");

            System.out.print("Opcion: ");
            int opc = read.nextInt();
            switch (opc) {
                case 1 ->
                    ed.addAll(crearPolideportivo());

                case 2 ->
                    ed.addAll(crearEdificiosOficina());

                case 3 ->
                    listarEdificios();
                case 4 ->
                    salir = true;
                default ->
                    System.out.println("Opción incorrecta");
            }

        } while (!salir);

    }

    public ArrayList<Edificio> crearEdificiosOficina() {

        for (int i = 0; i < 10; i++) {

            edo.add(new EdificioDeOficinas(rand.nextInt(4, 8), rand.nextInt(2, 16), rand.nextInt(12, 30), rand.nextInt(30, 50), rand.nextInt(6, 48), rand.nextInt(15, 88)));
        }
        return edo;
    }

    public ArrayList<Edificio> crearPolideportivo() {

        for (int i = 0; i < 10; i++) {

            poli.add(new Polideportivo(rand.nextBoolean(), rand.nextInt(20, 90), rand.nextInt(15, 25), rand.nextInt(30, 120)));
        }
        return poli;
    }

    public void listarEdificios() {
        int totalPersonas = 0, poliTechado = 0, poliNoTechado = 0;
        for (Edificio edificio : ed) {
            System.out.println(edificio.toString());
            if (edificio instanceof Polideportivo) {
                if (((Polideportivo) edificio).isTechado()) {
                    poliTechado++;
                } else {
                    poliNoTechado++;
                }
            }
            if(edificio instanceof EdificioDeOficinas) {
          
                totalPersonas += ((EdificioDeOficinas) edificio).personasPorEdificio();
            }
        }
        
        System.out.println("\nLa cantidad de Polideportivos Techados es: " + poliTechado);
        System.out.println("La cantidad de Polideportivos no Techados es: " + poliNoTechado);
        System.out.println("La cantidad de Personas de todos los edificios es:  " + totalPersonas);
    }

    
}
