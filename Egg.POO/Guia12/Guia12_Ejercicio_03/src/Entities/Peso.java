
package Entities;

/**
 *
 * @author hectorCicuttil
 */
public enum Peso {
    RANGO1(1,19,100),
    RANGO2(20,49,500),
    RANGO3(50,79,800),
    RANGO4(80,Integer.MAX_VALUE,1000);

    private Integer min, max, valor;
    
  Peso (Integer min, Integer max, Integer valor){
        this.min = min;
        this.max = max;
        this.valor = valor;
    }

  public static Peso plusPeso(Integer p) {
      if(p >= RANGO1.min && p <= RANGO1.max){
          return RANGO1;
      }
      if(p >= RANGO2.min && p <= RANGO2.max){
          return RANGO2;
      }
      if(p >= RANGO3.min && p <= RANGO3.max){
          return RANGO3;
      }
      if (p >= RANGO4.min && p <= RANGO4.max) {
          return RANGO4;
      }
return null;
  }
    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    public Integer getValor() {
        return valor;
    }
    
}
