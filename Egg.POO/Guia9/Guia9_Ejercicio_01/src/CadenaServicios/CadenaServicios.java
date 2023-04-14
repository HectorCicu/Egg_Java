package CadenaServicios;

import Entidades.Cadena;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class CadenaServicios {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena frase) {

        String cadenita = frase.getCade();
        int vocales = 0;

        for (int i = 0; i < frase.getLongitud(); i++) {

            if (cadenita.substring(i, i + 1).equalsIgnoreCase("a")
                    || cadenita.substring(i, i + 1).equalsIgnoreCase("e")
                    || cadenita.substring(i, i + 1).equalsIgnoreCase("i")
                    || cadenita.substring(i, i + 1).equalsIgnoreCase("o")
                    || cadenita.substring(i, i + 1).equalsIgnoreCase("u")) {
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales de la frase ingresada es " + vocales);
    }

    //Método invertirFrase(), deberá invertir la 
//    frase ingresada y mostrarla por pantalla. 
//    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena frase) {
        char[] ch = new char[frase.getLongitud()];
        char[] chinv = new char[frase.getLongitud()];
        String fr = frase.getCade();
        ch = fr.toCharArray();
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {

            chinv[i] = ch[(frase.getLongitud() - 1) - i];

        }
        
        System.out.println("la frase original es  " + frase.getCade());
        System.out.println("la frase invertida es " + Arrays.toString(chinv));
 
    }
//        Método vecesRepetido
//        (String letra), recibirá un carácter ingresado 
//        por el usuario y contabilizar cuántas veces se repite 
//        el carácter en la frase, por ejemplo:
//        Entrada:
//        frase = "casa blanca".Salida
//        : El carácter 'a' se repite 4 veces.

    public void vecesRepetido(Cadena frase) {

        System.out.print("Ingrese el caracter a buscar: ");
        String c = read.next();
        String cadenita = frase.getCade();
        int cantidad = 0;

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (cadenita.substring(i, i + 1).equalsIgnoreCase(c)) {
                cantidad++;
            }

        }
        System.out.println("La cantidad de veces que se repite la letra '" + c + "' es " + cantidad);
    }
//    Método compararLongitud(String frase), deberá comparar la longitud
//de la frase que compone la clase con otra nueva frase ingresada por
//el usuario.
//    

    public void compararlongitud(Cadena frase) {
        System.out.print("Ingrese la frase a comparar longitud: ");
        String frase2 = read.next();
        int igual = frase.getCade().compareTo(frase2);
        if (igual == 0) {
            System.out.println("Las cadenas tienen el mismo largo");
        } else if (igual > 0) {
            System.out.println("La cadena original es de mayor longitud");
        } else {
            System.out.println("La cadena ingresada es de mayor longitud");
        }
    }
//Método unirFrases(String frase), deberá unir la frase contenida en la
//clase Cadena con una nueva frase ingresada por el usuario y mostrar
//la frase resultante.

    public void unirFrases(Cadena frase) {
        System.out.print("Ingrese la frase a unir: ");
        String frase2 = read.next();
        System.out.println("La frase resultante es " + frase.getCade().concat(frase2));
    }

//    Método reemplazar(String letra), deberá reemplazar todas las letras
//“a” que se encuentren en la frase, por algún otro carácter
//seleccionado por el usuario y mostrar la frase resultante.
    public void reemplazar(Cadena frase) {

        System.out.print("Ingrese el caracter a reempazar: ");
        String c = read.next();

        String nuevaFrase = frase.getCade().replace("a", c);

        System.out.println("La frase reemplazada es--->  " + nuevaFrase);

    }

//    Método contiene(String letra), deberá comprobar si la frase contiene
//una letra que ingresa el usuario y devuelve verdadero si la contiene y
//falso si no.
    public void contiene(Cadena frase) {
        System.out.print("Ingrese el caracter a buscar: ");
        String c = read.next();
        boolean tiene  = frase.getCade().contains(c);
        if (tiene) {
            System.out.println("La frase contiene el caracter " + c);
        } else {
            System.out.println("La frase NO contiene el caracter " + c);
        }
    }

}

