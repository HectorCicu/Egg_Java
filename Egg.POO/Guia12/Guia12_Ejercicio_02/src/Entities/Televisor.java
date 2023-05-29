

package Entities;

/**
 *
 * @author Hector Cicutti
 */
public class Televisor extends Electrodomestico{
    
   private Integer pulgadas;
   private Boolean sintoTDC;

    

    public Televisor() {
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintoTDC() {
        return sintoTDC;
    }

    public void setSintoTDC(Boolean sintoTDC) {
        this.sintoTDC = sintoTDC;
    }

    public Televisor(Integer pulgadas, Boolean sintoTDC) {
        this.pulgadas = pulgadas;
        this.sintoTDC = sintoTDC;
    }

    public Televisor(Integer pulgadas, Boolean sintoTDC, Double precio, Colores color, ConsumoEnergetico consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintoTDC = sintoTDC;
    }


    @Override
    public String toString() {
        return "Televisor{" + "pulgadas=" + pulgadas + ", sintoTDT=" + sintoTDC + " " + super.getPrecio() + " " + super.getConsumo() + "  " + super.getPeso();
    }
  
   public static Double precioFinal(Integer pulgadas,  Boolean tdt , Double precioF, String consumoF) {
        
        if (pulgadas > 40) {
            precioF = (precioF * 1.30);
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
