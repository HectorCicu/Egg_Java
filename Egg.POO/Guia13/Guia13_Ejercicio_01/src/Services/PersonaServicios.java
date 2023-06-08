package Services;


import Entities.Persona;
import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class PersonaServicios {
//Método esMayorDeEdad(): indica si la persona es mayor de edad. La
//función devuelve un booleano.

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public boolean mayorEdad(Persona p) {
        boolean b;
      
        b = p.getEdad() >= 18;
        return b;
    }

    /* Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje 
     */
    public Persona crearPersona(Persona p) {
        String sex;
        boolean sexbool = true;
        System.out.print("\nNombre: ");
        p.setNombre(read.next());
        System.out.print("Edad: ");
        p.setEdad(read.nextInt());
        do {
            System.out.print("Sexo (M = masc. - F = fem. - O = Otro: ");
            sex = read.next();
            if (sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("F") || sex.equalsIgnoreCase("o")) {
                p.setSexo(sex.toUpperCase());
                sexbool = false;
            }
        } while (sexbool);
        System.out.print("Peso (kgs.): ");
        p.setPeso(read.nextDouble());
        System.out.print("Altura (metros): ");
        p.setAltura(read.nextDouble());

        return p;
    }

    /* Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.*/
    public int calcularIMC(Persona p) {
        int imc = (int) (p.getPeso() / Math.pow(p.getAltura(), 2));
        int indice;
        if (imc < 20) {
            indice = -1;
        } else if (imc <= 25) {
            indice = 0;
        } else {
            indice = 1;
        }
        return indice;

    }

}
