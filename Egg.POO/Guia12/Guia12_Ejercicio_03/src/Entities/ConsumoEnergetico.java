package Entities;

import java.util.Objects;



/**
 *
 * @author Hector Cicutti
 */
public enum ConsumoEnergetico {
    A(1000,1),
    B(800,2),
    C(600,3),
    D(500,4),
    E(300,5),
    F(100,6);
    
    private Integer valueConsumo;
    private Integer azar;
    
    ConsumoEnergetico(Integer valueConsumo , Integer azar) {
        this.valueConsumo = valueConsumo;
        this.azar = azar;
    } 

    public Integer getValueConsumo() {
        return valueConsumo;
    }

    public Integer getAzar() {
        return azar;
    }
      public static ConsumoEnergetico obtenerConsumo(Integer c) {
        for (ConsumoEnergetico ce : ConsumoEnergetico.values()) {
            if (Objects.equals(ce.getAzar(), c)) {
                return ce;
            }
        }
        return null;
    }

   
    
}
