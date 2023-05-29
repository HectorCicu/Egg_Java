package Entities;

import Services.CaballoService;

/**
 *
 * @author Hector Cicutti
 */
public class Caballo extends CaballoService {

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void setAlimento(String alimento) {
        super.setAlimento(alimento);

    }

    @Override
    public String getAlimento() {
        return super.getAlimento();
    }

//    @Override
//    public void alimentarse() {
//        System.out.printf("Mi nombre es %s, estoy soy raza %s y tengo %S años. Estoy comiendo %s",getNombre(), getRaza(), getEdad(), getAlimento());
//    }
}
