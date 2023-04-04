package Servicios;

import CuentaBancaria.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class CuentaServicios {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    String tipoc = "";
   CuentaBancaria cta = new CuentaBancaria();
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
                     cta = altaCuenta();
                    break;
                case 2:
                    ingresaDinero(cta);
                    break;
                case 3:
                    retiraDinero(cta);
                    break;
                case 4:
                    consultaSaldo(cta);
                    break;
                case 5:
                    consultaCuenta(cta);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    break;
            }
        } while (!salir);

    }

    public CuentaBancaria altaCuenta() {
        System.out.println("\nALTA CUENTA CORRIENTE");
        System.out.println("---------------------");
        System.out.print("Nombre: ");
        String nom = read.next();
        System.out.print("Apellido: ");
        String ape =read.next();
        System.out.print("Número Cuenta: ");
        int cta = read.nextInt();
        do {
            System.out.print("Tipo de Cuenta (C = Corriente // A = Caja Ahorros): ");
            tipoc = read.next();
        } while (!tipoc.equalsIgnoreCase("C") && !tipoc.equalsIgnoreCase("A"));
         
        return new CuentaBancaria(nom, ape, cta, tipoc, 0);
    }

    public void consultaSaldo(CuentaBancaria c1) {
        System.out.println("\n El saldo de la cuenta es " + c1.getSaldo());
    }

    public void consultaCuenta(CuentaBancaria c1) {
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

    public void ingresaDinero(CuentaBancaria c1) {
        double saldo = c1.getSaldo();
        System.out.println("\nDEPOSITOS");
        System.out.println("---------");
        System.out.println("\nEl saldo actual es $ " + saldo);
        System.out.print("Monto a Depositar: ");
        saldo += read.nextDouble();
        c1.setSaldo(saldo);
        System.out.println("El nuevo saldo de la cuenta es $ " + saldo);
    }

    public void retiraDinero(CuentaBancaria c1) {
        double saldo = c1.getSaldo();
        double retiro;
        System.out.println("\nEl saldo actual es $ " + saldo);
        do {
            System.out.print("\nIngrese monto a Retirar $ ");
            retiro = read.nextDouble();

            if (retiro > saldo * 0.2) {
                System.out.println("No es posible retirar más del 20% de su saldo");

            }
        } while (retiro > saldo * 0.2);

        saldo -= retiro;
        System.out.println("El nuevo saldo de la cuenta es $ " + saldo);
        c1.setSaldo(saldo);
    }
}
