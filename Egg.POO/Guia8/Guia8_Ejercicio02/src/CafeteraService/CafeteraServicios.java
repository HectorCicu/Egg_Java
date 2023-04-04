package CafeteraService;

import Cafetera.Cafetera;
import java.util.Scanner;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con
 * los atributos capacidadMáxima (la cantidad máxima de café que puede contener
 * la cafetera) y cantidadActual (la cantidad actual de café que hay en la
 * cafetera). Agregar constructor vacío y con parámetros así como setters y
 * getters. Crear clase CafeteraServicio en el paquete Servicios con los
 * siguiente: a) Método llenarCafetera(): hace que la cantidad actual sea igual
 * a la capacidad máxima. b) Método servirTaza(int): se pide el tamaño de una
 * taza vacía, el método recibe el tamaño de la taza y simula la acción de
 * servir la taza con la capacidad indicada. Si la cantidad actual de café “no
 * alcanza” para llenar la taza, se sirve lo que quede. El método le informará
 * al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó
 * la taza. c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
 * d) Método agregarCafe(int): se le pide al usuario una cantidad de café, el
 * método lo recibe y se añade a la cafetera la cantidad de café indicada. 1.
 *
 * @author Temporal
 */
public class CafeteraServicios {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Cafetera llenarCafetera(Cafetera c1) {
        c1.setCantidadTazas(c1.getCapacMaxima());
        System.out.println("\nLa cafetera está llena con " + c1.getCantidadTazas() + " tazas");
        return c1;

    }

    public void servirTaza(Cafetera c1) {
        // taza chica = 1 café --  taza grande = 3 cafés
        String tipot = "";
        if (c1.getCantidadTazas() == 0) {
            System.out.println("\nLo siento, la cafetera está vacía.");
        } else {

            do {
                System.out.print("\nTamaño de la taza  (c = chica - g = grande)");
                tipot = read.next();
            } while (!tipot.equalsIgnoreCase("g") && !tipot.equalsIgnoreCase("c"));

            if (tipot.equalsIgnoreCase("g")) {
                if (c1.getCantidadTazas() < 3) {
                    System.out.println("\nSolo quedan " + c1.getCantidadTazas() + " tazas. Se servirá todo");
                    c1.setCantidadTazas(0);
                } else {
                    c1.setCantidadTazas(c1.getCantidadTazas() - 3);
                }
            } else {
                c1.setCantidadTazas(c1.getCantidadTazas() - 1);
            }

            System.out.println("\nQuedan " + c1.getCantidadTazas() + " tazas para servir");

        }

    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadTazas(0);
        System.out.println("\nLa cafetera fue vaciada");

    }
    public void cargarCafetera (Cafetera c1) {
        int carga = 0;
        do {
        System.out.print("Ingrese cantidad a cargar: ");
         carga = read.nextInt();
         if (carga > (c1.getCapacMaxima() - c1.getCantidadTazas())) {
             System.out.println("Está queriendo cargar más de la capacidad que le resta");
             System.out.println("a la cafetera. Puede cargar hasta " + (c1.getCapacMaxima() - c1.getCantidadTazas()) + " tazas");
         }
        } while (carga > (c1.getCapacMaxima() - c1.getCantidadTazas()));
        c1.setCantidadTazas(c1.getCantidadTazas() + carga);
    }

}
