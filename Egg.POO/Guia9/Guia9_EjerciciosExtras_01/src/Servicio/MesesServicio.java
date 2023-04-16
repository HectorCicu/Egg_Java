package Servicio;

import Entidad.Meses;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class MesesServicio {

    private static Scanner read = new Scanner(System.in).useDelimiter("\n");

    @SuppressWarnings("empty-statement")
    public void adivinarMes(Meses m) {
        Random rand = new Random();
        String mesSecreto =  m.getMes(rand.nextInt(12));
        String mesAdiv;
        boolean acierto = false;
        int intentos = 0, maximos = 3;
        while (intentos <= (maximos -1) && !acierto) {
            intentos++;
            System.out.println("Adivine el mes (intento " + intentos + " de " + maximos + "):  ");
            mesAdiv = read.next();
            if (mesAdiv.equalsIgnoreCase(mesSecreto)) {
                System.out.println("Felicitaciones! Acertó el mes!!!\n");
                acierto = true;
            }

        } 

        if (!acierto) {
            System.out.println("Lo siento, no acertó. El mes secreto es: " + mesSecreto + "\n");
        }
    }

}
