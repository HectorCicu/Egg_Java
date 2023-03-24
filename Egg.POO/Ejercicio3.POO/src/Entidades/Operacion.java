package Entidades;

import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class Operacion {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void cargaNros() {
        System.out.print("Ingrese primer número: ");
        setNum1(read.nextInt());
        System.out.print("Ingrese segundo número: ");
        setNum2(read.nextInt());
    }

    public double sumar() {
        return (double) getNum1() + getNum2();
    }

    public double restar() {
        return (double) getNum1() - getNum2();
    }

    public double multiplicar() {
        if (getNum1() == 0 || getNum2() == 0) {
            System.out.println("Por lo menos uno de los números es cero -  el resultado será cero");
            return 0;
        } else {
            return (double) getNum1() * getNum2();
        }
    }

    public double dividir() {
        if (getNum2() == 0) {
            System.out.println("Error: el divisor es cero -  retornará cero por error");
            return 0;
        } else {
            return (double) getNum1() / getNum2();
        }
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

}
