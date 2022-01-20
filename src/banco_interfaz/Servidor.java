/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco_interfaz;

import banco_interfaz.interfaces.Interfazbanco;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author roboc
 */
public class Servidor implements Interfazbanco {

    ArrayList<Cliente_Banco> base_datos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Cliente_Banco cliente_interno = new Cliente_Banco();

    @Override
    public void anadir_cliente() {
        System.out.println("¿Cual es tu nombre?");
        cliente_interno.nombre = sc.nextLine().toLowerCase();
        System.out.println("¿Introduzca su pin?");
        String pin = sc.nextLine();
        for (int i = 0; i < cliente_interno.pin.length; i++) {
            cliente_interno.pin[i] = pin.charAt(i);
        }
        System.out.println("¿Cuanto dinero quiere introducir a su cuenta?");
        cliente_interno.dineroCuenta = Integer.parseInt(sc.nextLine());
        base_datos.add(cliente_interno);
    }

    @Override
    public void mostrar_datos(Cliente_Banco cliente, int[] pin) {
        cliente_interno = buscar_usuario(cliente.getNombre());
        if (validacion_pin(cliente, cliente.pin)) {
            System.out.println("Sus datos son: \n\t" + cliente_interno.toString());
        }
    }

    @Override
    public void ingresar_saldo(Cliente_Banco cliente, int[] pin) {
        System.out.println("¿Cuanto dinero quieres ingresar?");
        cliente.dineroCuenta = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < base_datos.size(); i++) {
            if(base_datos.get(i).nombre.equals(cliente.nombre)){
                base_datos.get(i).dineroCuenta = base_datos.get(i).dineroCuenta + cliente.dineroCuenta;
                break;
            }
        }
    }

    @Override
    public void retirar_saldo(Cliente_Banco cliente, int[] pin) {
        System.out.println("¿Cuanto dinero quieres retirar?");
        cliente.dineroCuenta = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < base_datos.size(); i++) {
            if(base_datos.get(i).nombre.equals(cliente.nombre)){
                base_datos.get(i).dineroCuenta = base_datos.get(i).dineroCuenta - cliente.dineroCuenta;
                break;
            }
        }
    }

    @Override
    public void modificar_pin(Cliente_Banco cliente, int[] pin) {
        System.out.println("Introduzca su nuevo numero pin: ");
        
    }

    @Override
    public void realizar_deposito(Cliente_Banco cliente, int[] pin) {

    }

    @Override
    public void realizar_inversion(Cliente_Banco cliente, int[] pin) {

    }

    @Override
    public Cliente_Banco buscar_usuario(String nombre) {
        for (int i = 0; i < base_datos.size(); i++) {
            if (base_datos.get(i).nombre.equals(nombre)) {
                cliente_interno = base_datos.get(i);
            }
        }
        return cliente_interno;
    }

    @Override
    public boolean validacion_pin(Cliente_Banco cliente, int[] pin) {
        boolean correcto = false;
        cliente_interno = buscar_usuario(cliente.getNombre());
        if (cliente_interno.pin[0] == pin[0] && cliente_interno.pin[1] == pin[1]
                && cliente_interno.pin[2] == pin[2] && cliente_interno.pin[3] == pin[3]) {
            correcto = true;
        }
        return correcto;
    }
}
