package Entities;

import Interfaces.Calculos;

public class YateDeLujo extends BarcoAMotor implements Calculos {

    private int camarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int camarotes, int potenciaCV, int eslora, int anioFabric, String matricula) {
        super(potenciaCV, eslora, anioFabric, matricula);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "YateDeLujo{" + "camarotes=" + camarotes + '}';
    }

    @Override
    public void calculoAlquiler(int precio, int dias) {
        int alquiler = precio * dias * (MODULO + super.getPotenciaCV() + camarotes) * super.getEslora();
        System.out.printf("El alquiler de este Yate de Lujo, matrícla %s, de %s camarotes, potencia %s CV , de %s m de eslora y año de fabricación %s es de $ %s ", super.getMatricula(), camarotes, super.getPotenciaCV(), super.getEslora(),super.getAnioFabric(), alquiler);
        System.out.println("");
    }

}
