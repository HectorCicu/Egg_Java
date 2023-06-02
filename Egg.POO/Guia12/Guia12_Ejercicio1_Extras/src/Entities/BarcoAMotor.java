package Entities;

import Interfaces.Calculos;

public class BarcoAMotor extends Barco implements Calculos {

    private int potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potenciaCV, int eslora, int anioFabric, String matricula) {
        super(eslora, anioFabric, matricula);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public void calculoAlquiler(int precio, int dias) {
        int alquiler = precio * dias *( MODULO + potenciaCV) * super.getEslora();
        System.out.printf("El alquiler de este Barco a Motor, matrícula %s, potencia %s CV, de %s metros de eslora y año de fabricación %s es de $ %s \n",super.getMatricula(), potenciaCV, super.getEslora(), super.getAnioFabric() , alquiler);
       
    }

    
}
