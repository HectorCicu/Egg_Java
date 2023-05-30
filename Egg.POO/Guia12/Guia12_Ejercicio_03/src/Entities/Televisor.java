package Entities;

/**
 *
 * @author Hector Cicutti
 */
public class Televisor extends Electrodomestico {

    private Integer pulgadas;
    private Boolean sintoTDT;

    public Televisor() {
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintoTDT() {
        return sintoTDT;
    }

    public void setSintoTDT(Boolean sintoTDT) {
        this.sintoTDT = sintoTDT;
    }

    public Televisor(Integer pulgadas, Boolean sintoTDT) {
        this.pulgadas = pulgadas;
        this.sintoTDT = sintoTDT;
    }

    public Televisor(Integer pulgadas, Boolean sintoTDT, Double precio, Colores color, ConsumoEnergetico consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintoTDT = sintoTDT;
    }

    @Override
    public String toString() {
        return "Televisor pulgadas=" + pulgadas + ", sintoTDT=" + sintoTDT +"  - Color: " +super.getColor() +"  - Consumo "+ super.getConsumo() 
                +"  - Peso: " +super.getPeso()+" kg.   - Precio $" + super.getPrecio() + "\n";
    }

}
