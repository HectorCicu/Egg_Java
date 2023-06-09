package Services;

import Entities.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class Operaciones {

    private static DivisionNumero ds = new DivisionNumero();
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static int numero1;
    private static int numero2;

    @SuppressWarnings("empty-statement")
    public static void division() {

        try {
            System.out.print("Ingrese primer número: ");
            numero1 = Integer.parseInt(read.nextLine());
            System.out.print("Ingrese segundo número: ");
            numero2 = read.nextInt();
            
            ds.setNum1(numero1);
            ds.setNum2(numero2);
            
            System.out.println("Resultado = " + numero1 / numero2);

        } catch (ArithmeticException ae) {

            System.out.println("Uy, que kilombo...");
            System.out.println(ae.getMessage());
            
        } catch (NumberFormatException nfe) {

            System.out.println("Uy, que kilombo2...");
            System.out.println(nfe.getMessage());

        } catch (InputMismatchException ime) {

            System.out.println("Uy, que kilombo 3...");
            System.out.println(ime.getMessage());
        }
    
    }
}
