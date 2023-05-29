package Services;

import Entities.Colores;
import Entities.ConsumoEnergetico;
import Entities.Electrodomestico;
import Entities.Televisor;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class TelevisorService {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public static Televisor crearTelevisor() {
        Double precio;
        String color;
        Colores colo;
        char sino;
        ConsumoEnergetico consumo;
        String consum, sintonizador;
        Integer pulgadas;
        boolean esValido = false, sintoTDC = false;
        System.out.println("Ingreso Televidor");
        System.out.print("Precio $: ");
        precio = read.nextDouble();
        do {
            System.out.print("Color : ");
            color = read.next().toUpperCase();

            for (Colores col : Colores.values()) {
                if (color.equals(col.name())) {
                    esValido = true;
                }
            }
            if (!esValido) {
                System.out.println("Color erróneo - Solo Válidos > BLANCO, NEGRO, ROJO, AZUL, GRIS ");
            }
        } while (!esValido);
        esValido = false;
        do {
            System.out.print("Consumo Energético (A-F): ");

            consum = read.next().toUpperCase();
            for (ConsumoEnergetico con : ConsumoEnergetico.values()) {
                if (Objects.equals(consum, con.name())) {
                    esValido = true;
                }
            }
            if (!esValido) {
                System.out.println("Tipo consumo erróneo - Solo válidos (A B C D E F) ");
            }
        } while (!esValido);
        System.out.print("Pulgadas: ");
        pulgadas = read.nextInt();
        System.out.print("Peso: ");
        Double peso = read.nextDouble();
        do {
            System.out.print("Tiene Sintonizador TDC (S/N): ");
            sintonizador = read.next().toUpperCase();
            if (sintonizador.equalsIgnoreCase("S")) {
                esValido = true;
                sintoTDC = true;
            } else if (sintonizador.equalsIgnoreCase("N")) {
                esValido = true;
                sintoTDC = false;

            } else {
                System.out.println("Valor erróneo - solo válidos (S/N)");
            }
        } while (!esValido);

        Double precio1 = Televisor.precioFinal(pulgadas, sintoTDC, precio, consum);
        Televisor tv = new Televisor(pulgadas, sintoTDC, precio1, Enum.valueOf(Colores.class, String.valueOf(color)),
                Enum.valueOf(ConsumoEnergetico.class, consum), peso);

        return tv;
    }

}
