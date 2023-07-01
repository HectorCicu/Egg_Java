

package Estancias.services;

import Estancias.entidades.Familias;
import Estancias.persistencia.FamiliasDAO;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Hector Cicutti
 */
public class FamiliasService {
    private static FamiliasDAO fd = new FamiliasDAO();
    private static Collection<Familias> family = null;
    
    /*a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.*/
    public void FamiliaHijos() {
        try{
            family=new ArrayList();
            family.addAll(fd.consultaFamiliasCon3Hijos());
            System.out.println("\nLISTADO FAMILIAS CON 3 HIJOS Y MENORES DE 10 AÑOS");
            System.out.println("\nID Fam  -               Nombre  -   Edad min - Edad Max        -                      email");
            for (Familias f : family) {
               
                System.out.println(String.format("%10s%30s%14s%10s%60s", f.getIdFamilia(), f.getNombreFamilia()
                , f.getEdadMinima(), f.getEdadMaxima(), f.getEmail()));
                
                
            }
        }catch(Exception e){
            
        }
            
    }

}
