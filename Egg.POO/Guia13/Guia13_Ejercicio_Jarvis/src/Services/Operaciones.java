

package Services;

import Entities.Armadura;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hector Cicutti
 */
public class Operaciones {
private static Armadura jarvis = new Armadura();
    
    public static void caminar(Armadura jarv , int minutos, int consumo ) {
        
        jarv.setPulsoredBotaDerecha(jarv.getPulsoredBotaDerecha() - (consumo*minutos));
        
        
    }
            
}
