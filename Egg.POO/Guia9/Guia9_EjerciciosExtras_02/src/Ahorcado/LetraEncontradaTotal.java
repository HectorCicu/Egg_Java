package Ahorcado;

/**
 *
 * @author Hector Cicutti
 */
public class LetraEncontradaTotal {

    char[] letrasEncontradasTotal;

    public LetraEncontradaTotal() {
        letrasEncontradasTotal = new char[26];
    }

    public char[] getLetraEncontradasTotal() {
        return letrasEncontradasTotal;
    }

    public void setLetraEncontradasTotal(char[] letrasEncontradasTotal) {
        this.letrasEncontradasTotal = letrasEncontradasTotal;
    }

    public void setLetraEncontradasTotal(char letrasEncontradasTotal, int i) {
        this.letrasEncontradasTotal[i] = letrasEncontradasTotal;

    }

    public char getLetraEncontradasTotal(int i) {
        return letrasEncontradasTotal[i];
    }

}
