package Entities;



/**
 *
 * @author Hector Cicutti
 */
public class Lavadora extends Electrodomestico {

    private Integer carga;

    

  
    public Lavadora(Integer carga, Double precio, Colores color, ConsumoEnergetico consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }


    

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return "Lavadora carga= " + carga + "  - Color: " +super.getColor() +"  - Consumo "+ super.getConsumo() 
                +"  - Peso: " +super.getPeso()+" kg.   - Precio $" + super.getPrecio()+ "\n";
    }

}
