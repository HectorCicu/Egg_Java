

package Entidades;

/**
 *
 * @author Hector Cicutti
 */
public class YaBarajo {
private boolean barajo ;

    public YaBarajo() {
        barajo = false;
    }

    public boolean getBarajo() {
        return barajo;
    }

    public void setBarajo(boolean barajo) {
        this.barajo = barajo;
    }

    @Override
    public String toString() {
        return "YaBarajó? -> " + barajo ;
    }
    

}
