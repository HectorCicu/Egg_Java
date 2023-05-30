package Entities;

import Entities.ConsumoEnergetico;

/**
 *
 * @author Hector Cicutti
 */
public class Electrodomestico {

    private Double precio;
    private Colores color;
    private ConsumoEnergetico consumo;
    private Integer peso;

    public Electrodomestico() {
        this.consumo = ConsumoEnergetico.F;
        this.color = Colores.AZUL;
    }

    public Electrodomestico(Double precio, Colores color, ConsumoEnergetico consumo, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsumo() {
        return consumo;
    }

    public void setConsumo(ConsumoEnergetico consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico ";
    }

    
}
