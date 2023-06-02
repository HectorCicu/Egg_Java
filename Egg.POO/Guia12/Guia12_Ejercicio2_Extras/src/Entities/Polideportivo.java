package Entities;

import Services.EdificioServices;
import java.text.DecimalFormat;

/**
 * • Clase Polideportivo con su nombre y tipo de instalación que puede ser
 * Techado o Abierto, esta clase implementará los dos métodos abstractos y los
 * atributos del padre.
 *
 * @author Hector Cicutti
 */
public class Polideportivo extends EdificioServices {
 private static final DecimalFormat df = new DecimalFormat("###,###,###,###");
    boolean techado;



    public Polideportivo(boolean techado, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.techado = techado;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    
     @Override
    public int calcularSuperficie() {
        return super.calcularSuperficie(); 
    }

    @Override
    public int calcularVolumen() {
        return super.calcularVolumen(); 
    }


//    @Override
//    public int calcularSuperficie() {
//        return super.getAncho() * super.getLargo();
//    }
//
//    @Override
//    public int calcularVolumen() {
//        return super.getAlto() * super.getAncho() * super.getLargo();
//    }

    @Override
    public String toString() {
        return "Polideportivo techado=" + techado + "  - Superficie: "+ df.format( super.calcularSuperficie()) + " m2   -  Volumen: " + df.format(super.calcularVolumen() )+ " m3";
    }

}
