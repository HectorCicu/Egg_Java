package JuegoAhorcado2;


import Metodos2.AhorcadoServicios;


/**
 *
 * @author Hector Cicutti
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       AhorcadoServicios as = new AhorcadoServicios();
//        LetraEncontradaTotal le = new LetraEncontradaTotal();
//
//        Ahorcado ah = new Ahorcado();

        as.juego();

        System.out.println("\nFIN DEL JUEGO - MUCHAS GRACIAS - VUELVAS PRONTOS!!!!\n");

    }

}
