package ArregloMain;

import ArregloService.ArregloService;

/**
 * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo
 * B de 20 números reales. Crear la clase ArregloService, en el paquete
 * servicio, con los siguientes métodos:
 *
 * @author hhc
 */
public class ArregloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloService as = new ArregloService();
        double arregloA[] = new double[50];
        double arregloB[] = new double[20];
        
        as.inicializarA(arregloA);
        as.mostrar(arregloA);
        as.ordenar(arregloA);
      
        System.out.println("\nArregloB");
          as.inicializarB(arregloA, arregloB);
        
    }

}
