

package Tienda.Entidades;

/**
 *
 * @author Hector Cicutti
 */
public class Producto {

    private int codigoProducto;
    private String nombreProducto;
    private double precioProducto;
    private int codigoFabricante;

    public Producto() {
    }

    public Producto(int codigoProducto, String nombreProducto, double precioProducto, int codigoFabricante) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.codigoFabricante = codigoFabricante;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    
}
