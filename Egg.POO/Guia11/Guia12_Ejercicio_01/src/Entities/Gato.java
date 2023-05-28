package Entities;

import Services.GatoService;

/**
 *
 * @author Hector Cicutti
 */
public class Gato extends GatoService {

    public Gato(String nombre, String alimento, Integer edad, String raza) {
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
//          System.out.printf("Mi nombre es %s, estoy soy raza %s y tengo %S años. Estoy comiendo %s",getNombre(), getRaza(), getEdad(), getAlimento());
//    }
}
