

package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
4
 * @author Hector Cicutti
 */
public class PersonaServices {
private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(){
        System.out.print("Ingrese nombre: ");
        String nom = read.next();
                
        System.out.print("Fecha de nacimiento (dd/mm/YYYY): ");
        String[] fecha=read.next().split("/");
        
        return new Persona(nom, new Date(Integer.parseInt(fecha[2])-1900,Integer.parseInt(fecha[1])-1,Integer.parseInt(fecha[0])));
        
    }
    
//    b) Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual.
    
    public int calcularEdad(Persona p) {
        Date d = new Date();
        return (int) (((d.getTime() - p.getFechaNac().getTime())  / 1000000 )/ 31536);
    }
//    
//     Método menorQue recibe como parámetro una Persona y una edad.
//Retorna true si la persona es menor que la edad consultada o false
//en caso contrario.
    
    public boolean menorQue(Persona p, int edad) {
        return (calcularEdad(p)< edad);
    }
    
    public void mostrarPersona(Persona p) {
        
        System.out.println("\nNombre: " + p.getNombre() );
        System.out.printf("Fecha de nacimiento  %d / %d / %d " , p.getFechaNac().getDate() , 
                (p.getFechaNac().getMonth()+1), (p.getFechaNac().getYear() + 1900));
        System.out.println("Edad: " +  calcularEdad(p) + " años");
//        "SSS".formated()
//String.format("string",argumentos)  VER!!!!!
    }
}
/*
Date fechaNacimiento = persona.getFechaNacimiento();
        Calendar calendarNacimiento = Calendar.getInstance();
        calendarNacimiento.setTime(fechaNacimiento);

        Calendar calendarHoy = Calendar.getInstance();
        int edad = calendarHoy.get(Calendar.YEAR) - calendarNacimiento.get(Calendar.YEAR);
        if (calendarHoy.get(Calendar.DAY_OF_YEAR) < calendarNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }

        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona) < edad;
*/