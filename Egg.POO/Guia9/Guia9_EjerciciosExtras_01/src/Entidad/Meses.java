package Entidad;

/**
 *
 * @author Hector Cicutti
 */
/*
Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto
 */
public class Meses {

    private String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
        "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    public Meses() {

    }

    public String[] getMes() {
        return mes;
    }

    public String getMes(int i) {
        return mes[i];
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

}
