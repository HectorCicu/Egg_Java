package Entities;

import Interfaces.Calculos;

public class Velero extends Barco implements Calculos {

    private int nroMastiles;

    public Velero() {
    }

    public Velero(int nroMastiles, int eslora, int anioFabric, String matricula) {
        super(eslora, anioFabric, matricula);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "nroMastiles=" + nroMastiles + '}';
    }

    @Override
    public void calculoAlquiler(int precio, int dias) {
       int alquiler = precio * dias *( MODULO + nroMastiles) * super.getEslora();
        System.out.printf("El alquiler de este Velero, matrícula %s, de %s mástiles, año de fabricación %s y de %s m. de eslora, es de $ %s ", super.getMatricula(),nroMastiles, super.getAnioFabric(),super.getEslora(),alquiler);
        System.out.println("");
    }
    
}
