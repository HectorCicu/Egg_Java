package Services;

import Entities.Colores;
import Entities.ConsumoEnergetico;
import Entities.Electrodomestico;

import Entities.Lavadora;
import Entities.Peso;
import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class LavadoraService extends Services {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static final Random rand = new Random();

    public static ArrayList<Electrodomestico> crearLavadoras() {
        ArrayList<Electrodomestico> lv = new ArrayList<>();
        Double precio,  precioF ;
        Integer carga,  color, consumo, peso;
       
        for (int i = 0; i < 10; i++) {
            precio = rand.nextDouble(70000, 140000);
            peso = rand.nextInt(12,100);
            carga = rand.nextInt(8, 12);
            consumo = rand.nextInt(1,7);
            precioF = precioFinal(carga, String.valueOf(ConsumoEnergetico.obtenerConsumo(consumo)), precio, peso);
            
            lv.add(new Lavadora(carga, precioF, Colores.obtenerColor(rand.nextInt(1,6)), 
                    ConsumoEnergetico.obtenerConsumo(consumo), peso));
//            
//            System.out.println("precio " + precio+"  peso  " + peso +" carga "+ carga +" consumo "+ consumo+" precio final" + precioF );
//            System.out.println("lv    " + lv.toString());
//            read.next();
        }

//        System.out.println("LV" + lv.toString());
//        read.next();
        return lv;
    }

    public static Double precioFinal(Integer cargaF, String consumoF, Double precioF, Integer peso) {

        precioF = (cargaF > 30) ? precioF += 500.00 : precioF;
        precioF += Peso.plusPeso(peso).getValor() + ConsumoEnergetico.valueOf(consumoF).getValueConsumo();

        return precioF;
    }
}
