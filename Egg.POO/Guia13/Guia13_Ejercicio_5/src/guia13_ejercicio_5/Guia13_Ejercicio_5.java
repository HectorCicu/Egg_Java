
package guia13_ejercicio_5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class Guia13_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random rand = new Random();
        int numero = rand.nextInt(1,501);
        int adivinanza = 1000;
        boolean ganaste = false;
        int contador = 0;
        do {

            contador++;
            System.out.println("Introduce un numero entre 1 y 500:  (0 para salir)");
            try {
                adivinanza = Integer.parseInt(sc.next());
                if (numero == adivinanza) {
                    System.out.println("Adivinaste!");
                    ganaste = true;
                } else {
                    System.out.println(((numero < adivinanza) ? "Tu numero es mas grande!"
                            : "Tu numero es mas chico!"));
                }
             } catch (ArithmeticException ae) {

            System.out.println("Uy, que kilombo...");
            System.out.println(ae.getMessage());
            
        } catch (NumberFormatException nfe) {

            System.out.println("No  puedes ingresar una cadena. " + nfe.getLocalizedMessage());
            System.out.println(nfe.getMessage());

        } catch (InputMismatchException ime) {

            System.out.println("Uy, que kilombo 3...");
             System.out.println("No ingresaste un numero entero." + ime.fillInStackTrace());
            System.out.println(ime.getMessage());

               
            } catch (Exception e) {
                System.out.println("no funca nada  " + e.getMessage());

            } finally {

                if (adivinanza != 0) {
                    if (ganaste) {
                        System.out.println("Ganaste en " + contador);
                        System.out.println("Queres seguir jugando? (S/N)");
                        String opcion = sc.next().toUpperCase();
                        if (opcion.equals("N")) {
                            adivinanza = 0;
                        } else {
                            adivinanza = 1000;
                            ganaste = false;
                            numero = rand.nextInt(1,501);
                            contador = 0;

                        }
                    }
                }
            }
        } while (adivinanza != 0);
    }

    }


