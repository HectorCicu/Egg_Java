package Empleado;

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
 * "salario". Luego, crea un método "calcular_aumento" que calcule el aumento
 * salarial de un empleado en función de su edad y salario actual. El aumento
 * salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si
 * tiene menos de 30 años.
 *
 * @author Temporal
 */
public class Empleado {

    private String nombreEmpleado;
    private int edadEmpleado;
    private double salario;

    public Empleado(String nombreEmpleado, int edadEmpleado, double salario) {
        this.nombreEmpleado = nombreEmpleado;
        this.edadEmpleado = edadEmpleado;
        this.salario = salario;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getEdadEmpleado() {
        return edadEmpleado;
    }

    public void setEdadEmpleado(int edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado() {
    }

   
    public void calculaAumento() {
        double aumento, total;
        if (edadEmpleado > 30) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.05;
        }
         total = salario+ aumento;
        salario = total;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", edadEmpleado=" + edadEmpleado + ", salario=" + salario + '}';
    }
    
}
