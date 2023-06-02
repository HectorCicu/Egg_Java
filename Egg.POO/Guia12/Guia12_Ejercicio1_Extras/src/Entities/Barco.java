package Entities;

import Interfaces.Calculos;

public abstract class Barco implements Calculos {

    protected int eslora;

    protected int anioFabric;

    protected String matricula;

    public Barco() {
    }

    public Barco(int eslora, int anioFabric, String matricula) {
        this.eslora = eslora;
        this.anioFabric = anioFabric;
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabric() {
        return anioFabric;
    }

    public void setAnioFabric(int anioFabric) {
        this.anioFabric = anioFabric;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Barco{" + "eslora=" + eslora + ", anioFabric=" + anioFabric + ", matricula=" + matricula + '}';
    }
    
}
