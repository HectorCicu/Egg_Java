package JuegoAhorcado2LL;


import Metodos2LL.AhorcadoServiciosLL;


/**
 * En esta versión utilizo ArrayList de caracteres para guardar las letras que 
 * ingresa el usuario y determinar si ya las había ingresado.
 * @author Hector Cicutti
 */
public class JuegoAhorcadoLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       AhorcadoServiciosLL as = new AhorcadoServiciosLL();
//        LetraEncontradaTotal le = new LetraEncontradaTotal();
//
//        Ahorcado ah = new Ahorcado();

        as.juego();

        System.out.println("\nFIN DEL JUEGO - MUCHAS GRACIAS - VUELVAS PRONTOS!!!!\n");

    }

}
