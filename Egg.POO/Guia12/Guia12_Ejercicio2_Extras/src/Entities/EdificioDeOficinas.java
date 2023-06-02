package Entities;

import Services.EdificioServices;
import java.text.DecimalFormat;

/**
 * • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y número de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre.
 *
 * @author Hector Cicutti
 */
public class EdificioDeOficinas extends EdificioServices {
 private static final DecimalFormat df = new DecimalFormat("###,###,###,###");
    private int oficinas;
    private int pisos;
    private int personasPorOficina;

    public EdificioDeOficinas(int ancho, int alto, int largo) {
        super(ancho, alto, largo);
    }

  

    public EdificioDeOficinas(int oficinas, int pisos, int personasPorOficina, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.pisos = pisos;
        this.personasPorOficina = personasPorOficina;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    @Override
    public int calcularSuperficie() {
        return super.calcularSuperficie(); 
    }

    @Override
    public int calcularVolumen() {
        return super.calcularVolumen(); 
    }

    
public  int personasPorPiso() {
   return (oficinas * personasPorOficina);
}
public  int personasPorEdificio(){
   return ( oficinas * personasPorOficina * pisos);
}

    @Override
    public String toString() {
        return "Edificio - Oficinas= " + oficinas + " - pisos: " + pisos + "  - Personas por Piso: " + personasPorPiso() + "- Personas en el Edificio: "+personasPorEdificio()+ "  - Superficie: "+ df.format( super.calcularSuperficie()) + " m2   -  Volumen: " + df.format(super.calcularVolumen() )+ " m3";
    }


}
