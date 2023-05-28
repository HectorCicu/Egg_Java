package Entities;

import Services.LavadoraService;

/**
 *
 * @author Hector Cicutti
 */
public class Lavadora extends LavadoraService {

    private Character carga;

  
    public Lavadora(Character carga, Double precio, Colores color, ConsumoEnergetico consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }



    public void setCarga(Character carga) {
        this.carga = carga;
    }

    public Character getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

}
