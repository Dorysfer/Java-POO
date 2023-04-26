/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Home
 */
public class Cliente {
    private String numeroDeCuenta;
    private long DNI;
    private int saldoActual;

    public Cliente() {
    }

    public Cliente(String numeroDeCuenta, long DNI, int saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Sus datos son: " + "Número de Cuenta = " + numeroDeCuenta + ", DNI = " + DNI + ", Saldo actual = " + saldoActual;
    }
    
    
    
}
