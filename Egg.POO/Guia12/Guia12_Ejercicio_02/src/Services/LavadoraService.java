package Services;

import Entities.Colores;
import Entities.ConsumoEnergetico;
import Entities.Electrodomestico;

import Entities.Lavadora;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class LavadoraService {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public static Lavadora crearLavadora() {

        Double precio, peso;
        String color;
        Colores colo;
        ConsumoEnergetico consumo;
        String consum;
        Integer carga;
        boolean esValido = false;
        System.out.println("Ingreso Lavarropas");
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
                System.out.println("Tipo consumo erróneo - Sólo válidos (A B C D E F) ");
            }
        } while (!esValido);
        System.out.print("Peso: ");
        peso = read.nextDouble();
        System.out.print("Kg. Carga: ");
        carga = read.nextInt();
        Double precio1 = precioFinal(carga, consum, precio);
        Lavadora lv = new Lavadora(carga, precio1, Enum.valueOf(Colores.class, String.valueOf(color)),
                Enum.valueOf(ConsumoEnergetico.class, consum), peso);

        return lv;

    }

    public static Double precioFinal(Integer cargaF, String consumoF, Double precioF) {

        if (cargaF > 30) {
            precioF += 500.00;

        }
        switch (consumoF) {
            case "A" ->
                precioF += 1000.0;
            case "B" ->
                precioF += 800.0;
            case "C" ->
                precioF += 600.0;
            case "D" ->
                precioF += 500.0;
            case "E" ->
                precioF += 300.0;
            case "F" ->
                precioF += 100.0;
        }
        return precioF;
    }
}
