

package Servicios;

import Entidades.Nif;

import java.util.Scanner;


/**
 *
 * @author Temporal
 */
public class NifServicios {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public Nif cargarDni(Nif n) {
       long d;
        do{
        System.out.print("Ingrese DNI ");
        d= read.nextLong();
        }while (d < 1000000 || d > 99999999);
        n.setDni(d);
        return n;
    }
    
    public void obtenerNif(Nif n) {
        long doc = n.getDni();
        int digito = (int)doc%23;
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        if (digito > 22) {
            System.out.println("hay un error en la carga del DNI, verifique");
        }else {
            System.out.println("\nEl dígito verificador es " + digito);
            n.setLetra(letra[digito]);
            
        }
                
        }
        
        
    }

