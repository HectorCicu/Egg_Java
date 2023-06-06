package Entities;

public class EmpleadosFacultad extends PersonasFacultad {

    private Integer anioIngreso;

    private Integer nroDespacho;

    public EmpleadosFacultad() {
    }

    public EmpleadosFacultad(Integer anioIngreso, Integer nroDespacho, Integer id, String nombre, String apellido, String estadoCivil) {
        super(id, nombre, apellido, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.nroDespacho = nroDespacho;
    }

    public Integer getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(Integer anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public Integer getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(Integer nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    @Override
    public String toString() {
        return "EmpleadosFacultad{" + "anioIngreso=" + anioIngreso + ", nroDespacho=" + nroDespacho + '}';
    }
    
    
}
