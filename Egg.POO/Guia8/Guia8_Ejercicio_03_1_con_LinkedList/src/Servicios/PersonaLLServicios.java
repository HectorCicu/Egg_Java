package Servicios;

import Entidades.PersonaLL;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class PersonaLLServicios {
//Método esMayorDeEdad(): indica si la persona es mayor de edad. La
//función devuelve un booleano.

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public boolean mayorEdad(LinkedList<PersonaLL> p, int i) {
        PersonaLL pers = p.get(i);

        boolean b;
        b = pers.getEdad() >= 18;
        return b;
    }

    /* Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto PersonaLL. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje 
     */
    public PersonaLL crearPersona(PersonaLL p) {
        String sex;
        boolean sexbool = true;
        System.out.print("\nNombre: ");
        String nom = read.next();
        System.out.print("Edad: ");
        int edad = read.nextInt();
        do {
            System.out.print("Sexo (M = masc. - F = fem. - O = Otro: ");
            sex = read.next();
            if (sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("F") || sex.equalsIgnoreCase("o")) {

                sexbool = false;
            }
        } while (sexbool);
        System.out.print("Peso (kgs.): ");
        double peso = read.nextDouble();
        System.out.print("Altura (metros): ");
        double altura = read.nextDouble();

        return new PersonaLL(nom, edad, sex, peso, altura);
    }

    /* Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.*/
    public int calcularIMC(LinkedList<PersonaLL> p, int i) {
        PersonaLL pers = p.get(i);
        int imc = (int) (pers.getPeso() / Math.pow(pers.getAltura(), 2));
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
