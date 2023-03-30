
package EmpleadoMain;

import Empleado.Empleado;

/**
 *
 * @author hhc
 */
public class CalculaSalario {

    /*9*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Empleado e1 = new Empleado("Horacio", 30, 120000);
        Empleado e2 = new Empleado("Carlos", 22, 130000);
        Empleado e3 = new Empleado("Alberto", 45, 120000.66);
        Empleado e4 = new Empleado("Ignacio", 55, 109000.23);
        Empleado e5 = new Empleado("Roberto", 19, 137648.88);
        Empleado e6 = new Empleado("Santiago", 43, 120000);
        
        System.out.print("El sueldo del empleado " + e1.getNombreEmpleado() + " es $ " + e1.getSalario());
        e1.calculaAumento();
        System.out.println(".  El nuevo salario es $ " + e1.getSalario());
        
        System.out.print("El sueldo del empleado " + e2.getNombreEmpleado() + " es $ " + e2.getSalario());
        e2.calculaAumento();
        System.out.println(".  El nuevo salario es $ " + e2.getSalario());
        
        System.out.print("El sueldo del empleado " + e3.getNombreEmpleado() + " es $ " + e3.getSalario());
        e3.calculaAumento();
        System.out.println(".  El nuevo salario es $ " + e3.getSalario());
        
        System.out.print("El sueldo del empleado " + e4.getNombreEmpleado() + " es $ " + e4.getSalario());
        e4.calculaAumento();
        System.out.println(".  El nuevo salario es $ " + e4.getSalario());
        
        System.out.print("El sueldo del empleado " + e5.getNombreEmpleado() + " es $ " + e5.getSalario());
        e5.calculaAumento();
        System.out.println(".  El nuevo salario es $ " + e5.getSalario());
        
        System.out.print("El sueldo del empleado " + e6.getNombreEmpleado() + " es $ " + e6.getSalario());
        e6.calculaAumento();
        System.out.println(".  El nuevo salario es $ " + e6.getSalario());
        
        
    }

}
