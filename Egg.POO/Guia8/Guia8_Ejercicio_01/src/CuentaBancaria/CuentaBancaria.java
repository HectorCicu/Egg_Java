package CuentaBancaria;

/**
 * Se requiere un programa que modele una cuenta bancaria que posee los
 * siguientes atributos: u Nombres del titular. u Apellidos del titular. u
 * Número de la cuenta bancaria. u Tipo de cuenta: puede ser una cuenta de
 * ahorros o una cuenta corriente. u Saldo de la cuenta.
 *
 * @author Temporal
 */
public class CuentaBancaria {

    private String nombreTitular;
    private String apellidoTitular;
    private int nroCtaBancaria;
    private String tipoCuenta;   // ahorro - corriente
    private double Saldo = 0;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombreTitular, String apellidoTitular, int nroCtaBancaria, String tipoCuenta, double Saldo) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.nroCtaBancaria = nroCtaBancaria;
        this.tipoCuenta = tipoCuenta;
        this.Saldo = Saldo;
    }

    public CuentaBancaria(String nombreTitular, String apellidoTitular, int nroCtaBancaria, String tipoCuenta) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.nroCtaBancaria = nroCtaBancaria;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getApellidoTitular() {
        return apellidoTitular;
    }

    public void setApellidoTitular(String apellidoTitular) {
        this.apellidoTitular = apellidoTitular;
    }

    public int getNroCtaBancaria() {
        return nroCtaBancaria;
    }

    public void setNroCtaBancaria(int nroCtaBancaria) {
        this.nroCtaBancaria = nroCtaBancaria;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        if (tipoCuenta.equalsIgnoreCase("C")|| tipoCuenta.equalsIgnoreCase("A")) {
            
        this.tipoCuenta = tipoCuenta;
        }
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "nombreTitular=" + nombreTitular + ", apellidoTitular=" + apellidoTitular + ", nroCtaBancaria=" + nroCtaBancaria + ", tipoCuenta=" + tipoCuenta + ", Saldo=" + Saldo + '}';
    }

     
}
