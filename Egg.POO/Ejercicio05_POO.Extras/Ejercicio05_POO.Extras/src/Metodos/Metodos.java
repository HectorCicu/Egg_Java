package Metodos;

import CuentaBancaria.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class Metodos {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    String tipoc = "";
    CuentaBancaria c1 = new CuentaBancaria();
    int opc;
    boolean salir;

    public void menu() {
        do {
            salir = false;
            System.out.println("\nMENU DE OPERACIONES");
            System.out.println("-------------------");
            System.out.print("""
                         1- Alta Cuenta 
                         2- Dep\u00f3sitos
                         3- Retiros
                         4- Consulta Saldo
                         5- Consulta Cuenta
                         6- Salir
                          Opcion ->   """);

            opc = read.nextInt();
            switch (opc) {
                case 1:
                    altaCuenta();
                    break;
                case 2:
                    ingresaDinero();
                    break;
                case 3:
                    retiraDinero();
                    break;
                case 4:
                    consultaSaldo();
                    break;
                case 5:
                    consultaCuenta();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    break;
            }
        } while (!salir);

    }

    public void altaCuenta() {
        System.out.println("\nALTA CUENTA CORRIENTE");
        System.out.println("---------------------");
        System.out.print("Nombre: ");
        c1.setNombreTitular(read.next());
        System.out.print("Apellido: ");
        c1.setApellidoTitular(read.next());
        System.out.print("Número Cuenta: ");
        c1.setNroCtaBancaria(read.nextInt());
        do {
            System.out.print("Tipo de Cuenta (C = Corriente // A = Caja Ahorros): ");
            tipoc = read.next();
        } while (!tipoc.equalsIgnoreCase("C") && !tipoc.equalsIgnoreCase("A"));
        c1.setTipoCuenta(tipoc);
    }

    public void consultaSaldo() {
        System.out.println("\n El saldo de la cuenta es " + c1.getSaldo());
    }

    public void consultaCuenta() {
        System.out.println("\nCUENTA BANCARIA");
        System.out.println("---------------");
        System.out.println("Titular: " + c1.getApellidoTitular() + " " + c1.getNombreTitular());
        System.out.println("Número de Cuenta; " + c1.getNroCtaBancaria());
        if (c1.getTipoCuenta().equalsIgnoreCase("C")) {
            System.out.println("Tipo de Cuenta: Corriente");
        } else if (c1.getTipoCuenta().equalsIgnoreCase("A")) {
            System.out.println("Tipo de Cuenta: Caja de Ahorros");
        } else {
            System.out.println("No se registró correctamente el tipo de Cuenta");
        }
    }

    public void ingresaDinero() {
        double saldo = c1.getSaldo();
        System.out.println("\nDEPOSITOS");
        System.out.println("---------");
        System.out.println("\nEl saldo actual es $ " + saldo);
        System.out.print("Monto a Depositar: ");
        saldo += read.nextDouble();
        c1.setSaldo(saldo);
        System.out.println("El nuevo saldo de la cuenta es $ " + saldo);
    }

    public void retiraDinero() {
        double saldo = c1.getSaldo();
        double retiro;
        System.out.println("\nEl saldo actual es $ " + saldo);
        do {
            System.out.print("\nIngrese monto a Retirar $ ");
            retiro = read.nextDouble();

            if (retiro > saldo) {
                System.out.println("No es posible retirar más dinero que el saldo");

            }
        } while (retiro > saldo);

        saldo -= retiro;
        System.out.println("El nuevo saldo de la cuenta es $ " + saldo);
        c1.setSaldo(saldo);
    }
}
