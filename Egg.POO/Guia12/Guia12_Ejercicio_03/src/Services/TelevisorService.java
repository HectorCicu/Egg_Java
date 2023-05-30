package Services;

import Entities.Colores;
import Entities.ConsumoEnergetico;
import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Peso;
import Entities.Televisor;

import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class TelevisorService {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static final Random rand = new Random();

    public static ArrayList<Electrodomestico> crearTelevisores() {
        ArrayList<Electrodomestico> tvs = new ArrayList<>();
        Double precio, precioFin;
        Integer pulgadas, peso, color, consumo;
        Boolean sinto;

        for (int i = 0; i < 10; i++) {
            precio = rand.nextDouble(80000, 340000);
            peso = rand.nextInt(10, 100);
            pulgadas = rand.nextInt(32, 66);
            consumo = rand.nextInt(1, 7);
            sinto = (consumo<4);
            precioFin = precioFinal(pulgadas, sinto, precio, String.valueOf(ConsumoEnergetico.obtenerConsumo(consumo)),peso);

            tvs.add(new Televisor(pulgadas, sinto, precioFin, Colores.obtenerColor(rand.nextInt(1,6)),
                    ConsumoEnergetico.obtenerConsumo(consumo), peso));
        }

//        System.out.println("LV" + tvs.toString());
//        read.next();
        return tvs;
    }

//    Double precio1 = Televisor.precioFinal(pulgadas, sintoTDC, precio, consum);
//    Televisor tv = new Televisor(pulgadas, sintoTDC, precio1, Enum.valueOf(Colores.class, String.valueOf(color)),
//            Enum.valueOf(ConsumoEnergetico.class, consum), peso);
//
//    return tv ;
//}
    public static Double precioFinal(Integer pulgadas, Boolean tdt, Double precioF, String consumoF, Integer peso) {

        precioF = (pulgadas > 40) ? (precioF * 1.30) : precioF;
        precioF = (tdt) ? precioF + 500 : precioF;

        precioF = precioF + Peso.plusPeso(peso).getValor() + ConsumoEnergetico.valueOf(consumoF).getValueConsumo();

        return precioF;
    }
}
