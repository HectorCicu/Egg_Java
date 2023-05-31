
package Entities;

/**
 *
 * @author HectorCicutti
 */
public abstract interface CalculosFormas {
    public void calcularArea();
    public void calcularPerimetro();

    /**
     * se genera PI por pedido del ejercicio
     */
    public final double PI = 3.14159; 
}
