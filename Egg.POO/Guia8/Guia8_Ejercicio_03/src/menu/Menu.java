

package menu;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author SebastiÃ¡n Cozzi
 */
public class Menu {
    private String[] items;
    private String titulo;
    private int resultado;
    private String exit;
    
    public Menu(String[] items) {
        this.items = items;
        this.titulo = null;
        resultado=-1;
    }
    
    /**
     * Constructor de la clase {@code Menu}
     * @param titulo
     *      Titulo que va a representar el menu
     *          si no se especifica utiliza la pocisiÃ³n 0 del array items
     * @param items
     *      array de String con las opciones principales del menu
     * @param exit 
     *      texto para indicar el mensaje para la opcion de retorno o salida del
     *  menu
     *       
     */
    
    public Menu(String titulo, String[] items, String exit) {
        this.items = items;
        this.titulo = titulo;
        this.exit = exit;
        resultado=-1;
    }
    
    public Menu(String titulo,String[] items) {
        this.items = items;
        this.titulo = titulo;
        this.exit = null;
        resultado=-1;
    }
    
    public void setItems(String[] items) {
        this.items = items;
        this.titulo = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Devuelve el resultado de la ultima opcion elejida
     * 
     * @param 
     *  () Sin parametros
     * 
     * @return 
     *  devuelve un entero mayor que 1.
     */
    public int getResultado() {
        return resultado;
    }
    
    public int pregunta(){
        // inicializaciÃ³n de Scanner
        Scanner leer = new Scanner(System.in);
        resultado=leer.nextInt();
        cls();
        return resultado;
    }

    public int pregunta(boolean validar){
       
        Scanner leer = new Scanner(System.in);
        int inc=0;
        if (exit!= null) inc=1;
        do {
            resultado=leer.nextInt();
            if (resultado>0 && resultado<=items.length+inc)
                validar = false;
            else 
                System.out.println("OpciÃ³n incorrecta.");
        } while (validar);
        cls();
        return resultado;
    }
    
    @Override
    public String toString() {
        cls();
        String m;
        int inicio,inc;
        if (titulo == null) {
            inicio=1;
            inc=0;
            m=items[0] + "\n-----------------";
        }else{
            m=titulo + "\n-----------------";
            inicio=0;
            inc=1;
        }
        
        for (int i = inicio; i < items.length; i++){
            m= m + "\n %d) %s.".formatted(i+inc, items[i]);
        }
        if (exit != null) {
             m= m + "\n %d) %s.".formatted(items.length+1,exit);
        }
        m = m + "\nElija una OpciÃ³n: ";
        return m;
    }
    
    public void esperaTecla(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Precione Enter/Intro para continuar.");
        leer.nextLine();
    }
    public static void cls() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(100);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
