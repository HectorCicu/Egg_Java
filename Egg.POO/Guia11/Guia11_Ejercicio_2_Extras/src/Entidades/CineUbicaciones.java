

package Entidades;

/**
 *
 * @author Hector Cicutti
 */
public class CineUbicaciones {
private Character columna;
private Integer fila;
private Character ocupado = ' ';

    public CineUbicaciones() {
    }

    public CineUbicaciones( Integer fila, Character columna) {
        this.columna = columna;
        this.fila = fila;
        this.ocupado = ' ';
    }
    public CineUbicaciones(Integer fila, Character columna,  Character ocupado) {
        this.columna = columna;
        this.fila = fila;
        this.ocupado = 'X';
    }

    public Character getColumna() {
        return columna;
    }

    public void setColumna(Character columna) {
        this.columna = columna;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Character getOcupado() {
        return ocupado;
    }

    public void setOcupado(Character ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return " - Fi " + fila +  "Col: " + columna +  " -  oc: " + ocupado ;
    }


}