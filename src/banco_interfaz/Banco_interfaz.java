/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco_interfaz;

import banco_interfaz.interfaces.Interfazbanco;
import java.util.Scanner;

/**
 *
 * @author roboc
 */
public class Banco_interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interfazbanco interfaz = new Servidor();
        Scanner sc = new Scanner(System.in);
        Cliente_Banco cliente = new Cliente_Banco();
        boolean salir1 = false;
        boolean salir2 = false;

        System.out.println("Bienvenido");
        while (!salir1) {
            System.out.println("1. Añadir un cliente");
            System.out.println("2. Mas opciones");
            System.out.println("3. Salir");
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    interfaz.anadir_cliente();
                    break;
                case 2:
                    System.out.println("Para poder hacer otras operaciones debes introducir tu nombre y numero pin");
                    System.out.println("Introduce tu nombre: ");
                    cliente.nombre = sc.nextLine().toLowerCase();
                    System.out.println("Introduce el numero pin: ");
                    String pin_temp = sc.nextLine();
                    for (int i = 0; i < cliente.pin.length; i++) {
                        cliente.pin[i] = pin_temp.charAt(i);
                    }
                    if (interfaz.validacion_pin(cliente, cliente.pin)) {
                        while (!salir2) {
                            System.out.println("Elija una de las siguientes opciones:");
                            System.out.println("1. Mostra datos del cliente");
                            System.out.println("2. Ingresar Dinero");
                            System.out.println("3. Retirar Dinero");
                            System.out.println("4. Modificar Pin");
                            System.out.println("5. Realizar Inversion");
                            System.out.println("6. Realizar Deposito");
                            System.out.println("7. Salir");
                            int opcion2 = Integer.parseInt(sc.nextLine());
                            switch (opcion2) {
                                case 1:
                                    interfaz.mostrar_datos(cliente, cliente.pin);
                                    break;
                                case 2:
                                    interfaz.ingresar_saldo(cliente, cliente.pin);
                                    break;
                                case 3:
                                    interfaz.retirar_saldo(cliente, cliente.pin);
                                    break;
                                case 4:
                                    interfaz.modificar_pin(cliente, cliente.pin);
                                    break;
                                case 5:
                                    interfaz.realizar_inversion(cliente, cliente.pin);
                                    break;
                                case 6:
                                    interfaz.realizar_deposito(cliente, cliente.pin);
                                    break;
                                default:
                                    System.out.println("Hasta luego");
                                    salir2 = true;
                            }
                        }
                    }
                    break;
                default:
                    salir1 = true;
                    break;
            }
        }
    }
}
