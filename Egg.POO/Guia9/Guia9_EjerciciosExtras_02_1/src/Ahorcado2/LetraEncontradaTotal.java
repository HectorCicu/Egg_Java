package Ahorcado2;

import java.util.Arrays;

/**
 *
 * @author Hector Cicutti
 */
public class LetraEncontradaTotal {

    char[] letrasEncontradasTotal = new char[26];

    public LetraEncontradaTotal() {
        Arrays.fill(letrasEncontradasTotal, '1');
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
