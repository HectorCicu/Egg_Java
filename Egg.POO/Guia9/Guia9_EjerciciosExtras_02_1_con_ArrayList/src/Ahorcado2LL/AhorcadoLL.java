package Ahorcado2LL;

import java.util.ArrayList;

/**
 *
 * @author Hector Cicutti
 */
/*
Crear una clase AhorcadoLL (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario.
 */
public class AhorcadoLL {

    ArrayList<Character> palab = new ArrayList<Character>();
            char[] palabra;
    int letrasEncontradas;
    int jugadasMaximas;
    public AhorcadoLL() {
    }

    public AhorcadoLL(char[] palabra, int letrasEncontradas, int jugadasMaximas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public ArrayList<Character> getPalab() {
        return palab;
    }

    public void setPalab(ArrayList<Character> palab) {
        this.palab = palab;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public char getPalabra(int i) {   //para traer caracter por caracter del vector
        return palabra[i];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AhorcadoLL{");
        sb.append("palab=").append(palab);
        sb.append(", palabra=").append(palabra);
        sb.append(", letrasEncontradas=").append(letrasEncontradas);
        sb.append(", jugadasMaximas=").append(jugadasMaximas);
        sb.append('}');
        return sb.toString();
    }

}
