package Entities;

import Services.PerroService;

/**
 *
 * @author Hector Cicutti
 */
public class Perro extends PerroService {

    @Override
    public void setAlimento(String alimento) {
        super.setAlimento(alimento);

    }

    @Override
    public String getAlimento() {
        return super.getAlimento();
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

//    @Override
//    public void alimentarse() {
//            System.out.printf("Mi nombre es %s, estoy soy raza %s y tengo %S años. Estoy comiendo %s",getNombre(), getRaza(), getEdad(), getAlimento());
//    }

}
