/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banco_interfaz.interfaces;

import banco_interfaz.Cliente_Banco;

/**
 *
 * @author roboc
 */
public interface Interfazbanco {
    
    public void anadir_cliente();
    public void mostrar_datos(Cliente_Banco cliente, int[] pin);
    public void ingresar_saldo(Cliente_Banco cliente, int[] pin);
    public void retirar_saldo(Cliente_Banco cliente, int[] pin);
    public void modificar_pin(Cliente_Banco cliente, int[] pin);
    public void realizar_deposito(Cliente_Banco cliente, int[] pin);
    public void realizar_inversion(Cliente_Banco cliente, int[] pin);
    public Cliente_Banco buscar_usuario(String nombre);
    public boolean validacion_pin(Cliente_Banco cliente, int[] pin);
}
