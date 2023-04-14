package Entidades;

/**
 * Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como
 * atributos una frase (String) y su longitud. Agregar constructor vacío y con
 * atributo frase solamente. Agregar getters y setters. El constructor con frase
 * como atributo debe setear la longitud de la frase de manera automática. Crear
 * una clase CadenaServicio en el paquete servicios que implemente los
 * siguientes métodos:
 *
 * @author Temporal
 */
public class Cadena {
    private String cade;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String cade) {
        this.cade = cade;
        longitud = cade.length();
    }

    public String getCade() {
        return cade;
    }

    public void setCade(String cade) {
        this.cade = cade;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "cade=" + cade + ", longitud=" + longitud + '}';
    }
    
    

}
