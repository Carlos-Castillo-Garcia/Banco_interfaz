/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco_interfaz;

/**
 *
 * @author roboc
 */
public class Cliente_Banco {

    String nombre;
    double dineroCuenta;
    int[] pin= new int[4];
    double  dineroDeposito;

    public Cliente_Banco() {
    }

    public Cliente_Banco(String nombre, double dineroCuenta, double dineroDeposito) {
        this.nombre = nombre;
        this.dineroCuenta = dineroCuenta;
        this.dineroDeposito = dineroDeposito;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDineroCuenta() {
        return dineroCuenta;
    }

    public int[] getPin() {
        return pin;
    }

    public double getDineroDeposito() {
        return dineroDeposito;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDineroCuenta(double dineroCuenta) {
        this.dineroCuenta = dineroCuenta;
    }

    public void setPin(int[] pin) {
        this.pin = pin;
    }

    public void setDineroDeposito(double dineroDeposito) {
        this.dineroDeposito = dineroDeposito;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre);
        sb.append("\n\tDinero en Cuenta: ").append(dineroCuenta).append("€");
        sb.append("\n\tDinero en Deposito:").append(dineroDeposito).append("€");
        return sb.toString();
    }
}
