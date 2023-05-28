package Main;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author Hector Cicutti
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        animal.add(a);
        animal.add(b);
        animal.add(c);

        animal.forEach(Animal::hacerRuido);  // llamado a método
        
        System.out.println("///////////////////////////");
        for (Animal animal1 : animal) {
            animal1.hacerRuido();
        }

        System.out.println("///////////////////////////");

        animal.forEach(animals -> animals.hacerRuido());  // función lambda
    }

}
