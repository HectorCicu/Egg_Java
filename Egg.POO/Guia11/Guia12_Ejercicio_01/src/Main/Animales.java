package Main;

import Entities.Animal;
import Entities.Caballo;
import Entities.Gato;
import Entities.Perro;

/**
 *
 * @author Hector Cicutti
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaración de objeto perro
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        perro1.alimentarse();
        System.out.println("");

        Animal perro2 = new Perro("Teddy", "Croquetas", 7, "Bulldog");
        perro2.alimentarse();
        System.out.println("");

        Animal gato1 = new Gato("Pelusa", "Galletas", 2, "Siames");
        gato1.alimentarse();
        System.out.println("");

        Animal caballo1 = new Caballo("Spark", "Pasto", 9, "Fino");
        caballo1.alimentarse();
        System.out.println("");

    }

}
