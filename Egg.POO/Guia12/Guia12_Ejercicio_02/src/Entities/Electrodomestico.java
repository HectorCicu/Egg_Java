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
    private Double peso;

    public Electrodomestico() {
        this.consumo = ConsumoEnergetico.F;
        this.color = Colores.AZUL;
    }

    public Electrodomestico(Double precio, Colores color, ConsumoEnergetico consumo, Double peso) {
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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico " + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    public Double precioFinal(Integer pesoF, String consumoF, Double precioF) {
        
        if (pesoF <= 19) {
            precioF +=100.00;
        } else if (pesoF > 19 && pesoF <= 49) {
            precioF +=500.00;
        } else if (pesoF > 49 && pesoF <= 80) {
            precioF +=800.00;
        } else if (pesoF > 80) {
            precioF +=1000.00;
        }
        switch (consumoF) {
            case "A" ->
                precioF += 1000.;
            case "B" ->
                precioF += 800.;
            case "C" ->
                precioF += 600.;
            case "D" ->
                precioF += 500.;
            case "E" ->
                precioF += 300.;
            case "F" ->
                precioF += 100.;
        }
        return precioF;
    }
}
