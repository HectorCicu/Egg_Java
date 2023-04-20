package Metodos;

import Ahorcado.Ahorcado;
import Ahorcado.LetraEncontradaTotal;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 *
 * Método encontradas(letra): que reciba una letra ingresada por el usuario y
 * muestre cuantas letras han sido encontradas y cuántas le faltan. Este método
 * además deberá devolver true si la letra estaba y false si la letra no estaba,
 * ya que, cada vez que se busque una letra que no esté, se le restará uno a sus
 * oportunidades.
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

        System.out.print("Ingrese la palabra a adivinar: ");
        String palab = read.next();
        System.out.print("Ingrese cuántos intentos erróneos permitirá: ");
        a.setJugadasMaximas(read.nextInt());

        a.setPalabra(palab.toLowerCase().toCharArray()); // con el toCharArray convierto la palabra 
        //en un vector de caracteres y lo grabo en el array palabra
    }

// * ● Método longitud(): muestra la longitud de la palabra que se debe encontrar.
    public void longitud(Ahorcado a) {
        System.out.println("La longitud de la palabra es: " + a.getPalabra().length + " letras\n"); // con el get extraigo la palabra como vector y con el lenght muestro el largo

    }

    //método para determinar si la letra ingresada ya existe entre las cargadas
    // si no existe la graba en el array de letrasEncontradasTotal.
    public boolean letraYaCargada(LetraEncontradaTotal le, char letra) {
        boolean existe = false;
        for (int i = 0; i < le.getLetraEncontradasTotal().length; i++) {
            if (le.getLetraEncontradasTotal(i) == letra) {
                existe = true;
                break;
            } else {
                if (le.getLetraEncontradasTotal(i) == '1') {
                    le.setLetraEncontradasTotal(letra, i);
                    break;
                }
            }
        }
        return existe;
    }

    /* ● Método buscar(letra): este
 * método recibe una letra dada por el usuario y busca si la letra ingresada es
 * parte de la palabra o no. También informará si la letra estaba o no.
     */
    // previamente a este método, ejecutar otro para ver si ya la letra la cargó anteriromente
    public boolean buscar(Ahorcado a, char letra, char[] ubicacion) {
        boolean esta = false;
        //    int faltantes = a.getPalabra().length - a.getLetrasEncontradas();
        int existen = 0;
        for (int i = 0; i < a.getPalabra().length; i++) { //busco todas las coincidencias, por si hay más de una misma letra
            if (a.getPalabra(i) == letra) {
                ubicacion[i] = letra;
                existen++;
                esta = true;
            }
        }
        a.setLetrasEncontradas(a.getLetrasEncontradas() + existen);

        return esta;
    }

//       Método encontradas(letra): que reciba una letra ingresada por el usuario y
// * muestre cuantas letras han sido encontradas y cuántas le faltan.
    public void encontradas(Ahorcado a) {

        int faltantes = a.getPalabra().length - a.getLetrasEncontradas();
    }

    //    ● Método intentos(): para mostrar cuántas oportunidades le
    //  queda al jugador.
    public int intentos(Ahorcado a, int jugadas) {
        return a.getJugadasMaximas() - jugadas;
    }

    //    ● Método juego(): el método juego se encargará de llamar
    // * todos los métodos previamente mencionados e informará cuando el usuario
    // * descubra toda la palabra o se quede sin intentos. Este método se llamará en
    // * el main
    public void juego(LetraEncontradaTotal le, Ahorcado a) {
        char letraIntento;
        boolean encontro = false;
        int jugadas = 0;

        crearJuego(a);
        int letrasRestantes = a.getPalabra().length;
        char[] ubicacion = new char[a.getPalabra().length];
        Arrays.fill(ubicacion, '_');
        longitud(a);
        do {
            System.out.print("\nIngrese una letra (tiene " + intentos(a, jugadas) + " intentos para acertar): ");
            letraIntento = read.next().charAt(0);
            letraIntento = Character.toLowerCase(letraIntento);
            if (letraYaCargada(le, letraIntento)) {
                System.out.println("Esa letra ya la ingresó. intente con otra");

            } else {

                if (buscar(a, letraIntento, ubicacion)) {

                    // a.setLetrasEncontradas(a.getLetrasEncontradas() + 1);
                    if ((letrasRestantes - a.getLetrasEncontradas()) > 0) {
                        System.out.println("SI, esa letra existe en la palabra!");
                        System.out.println("Restan encontrar " + (letrasRestantes - a.getLetrasEncontradas()));
                        System.out.println("Ubicación de las letras -->  " + String.valueOf(ubicacion));
                    } else {
                        encontro = true;
                    }
                } else {
                    System.out.println("Esa letra No está en la palabra");
                    jugadas++;
                    System.out.println("le quedan " + intentos(a, jugadas) + " Intentos");

                }

            }
        } while (jugadas < a.getJugadasMaximas() && !encontro);

        if (encontro) {
            System.out.println("-------------------------------------------------------------" );
            System.out.println("FELICITACIONES!! ENCONTRO LA PALABRA ----> " + String.valueOf(a.getPalabra()));
            System.out.println("-------------------------------------------------------------" );
        } else {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("xxx  HA PERDIDO, QUE PENA...          :(               xxx");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            
        }
            
    }
}
