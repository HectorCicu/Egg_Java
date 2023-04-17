package Metodos;

import Ahorcado.Ahorcado;
import Ahorcado.LetraEncontradaTotal;
import java.util.Scanner;

/**
 *
 *
 * Método encontradas(letra): que reciba una letra ingresada por el usuario y
 * muestre cuantas letras han sido encontradas y cuántas le faltan. Este método
 * además deberá devolver true si la letra estaba y false si la letra no estaba,
 * ya que, cada vez que se busque una letra que no esté, se le restará uno a sus
 * oportunidades. ● Método intentos(): para mostrar cuántas oportunidades le
 * queda al jugador. ● Método juego(): el método juego se encargará de llamar
 * todos los métodos previamente mencionados e informará cuando el usuario
 * descubra toda la palabra o se quede sin intentos. Este método se llamará en
 * el main
 *
 * @author Hector Cicutti
 */
public class AhorcadoServicios {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    /*
     *Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.
     */
    public void crearJuego(Ahorcado a) {
        LetraEncontradaTotal le = new LetraEncontradaTotal();

        System.out.print("Ingrese la palabra a adivinar: ");
        String palab = read.next();
        System.out.print("Ingrese cuántos intentos erróneos permitirá: ");
        int extras = read.nextInt();

        a.setJugadasMaximas(extras);
        a.setPalabra(palab.toCharArray()); // con el toCharArray convierto la palabra 
        //en un vector de caracteres y lo grabo en el array palabra
    }

// * ● Método longitud(): muestra la longitud de la palabra que se debe encontrar.
    public void longitud(Ahorcado a) {
        System.out.println("La longitud de la palabra es: " + a.getPalabra().length + " letras"); // con el get extraigo la palabra como vector y con el lenght muestro el largo

    }

    /* ● Método buscar(letra): este
 * método recibe una letra dada por el usuario y busca si la letra ingresada es
 * parte de la palabra o no. También informará si la letra estaba o no.
     */
    public void buscar(Ahorcado a, char letra) {
        int faltantes = a.getPalabra().length - a.getLetrasEncontradas();
        int existen = 0;
        for (int i = 1; i < a.getPalabra().length; i++) {

        }

    }

}
