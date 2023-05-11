

package Servicios;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;

/**
 *
 * @author Hector Cicutti
 */
public class JugadorService {
    
public static void cargaJugadores() {
 Equipo e1 = new Equipo("Rosario Central");   
 
 ArrayList<Jugador> j1 = new ArrayList<>();

j1.add(new Jugador("Marco","Ruben", "centrodelantero", 9));
j1.add(new Jugador("Alan ","Marinelli", "centrodelantero",13));
j1.add(new Jugador("Diego"," Zabala", "volante", 8));
j1.add(new Jugador("Fabián"," Rinaudo", "defensor", 6));
j1.add(new Jugador("Luca"," Martínez Dupuy","centrodelantero", 18));
j1.add(new Jugador("Gino ","Infantino", "volante", 17));

e1.setJugador(j1);

    System.out.println(e1.toString());
    
}
}
