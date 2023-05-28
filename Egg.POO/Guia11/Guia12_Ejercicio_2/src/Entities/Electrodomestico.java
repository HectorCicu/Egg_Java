

package Entities;

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
        this.color= Colores.AZUL;
    }

    public Electrodomestico(Double precio, Colores color, ConsumoEnergetico consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

//    public Electrodomestico(Double precio, Double peso, enum consumo, enum color) {
//        this.precio = precio;
//        this.peso = peso;
//        this.consumo = ConsumoEnergetico.F;
//        this.color= Colores.AZUL;
//    }

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

    
}
