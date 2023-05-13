package Entidades;

/**
 *
 * @author Hector Cicutti
 */
public class Jugador_1 {

    private Integer id;
    private String nombre;
    private Boolean mojado;


    public Jugador_1() {
        this.mojado = false; //inicializo mojado como falso "seco"
    }

    public Jugador_1(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false; //inicializo mojado como falso "seco"
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", mojado=").append(mojado);
 
        sb.append('}');
        return sb.toString();
    }

    

}
