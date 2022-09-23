package lab1_tp3_directorio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import lab1_tp3_directorio.Cliente;
import lab1_tp3_directorio.Cliente;
import lab1_tp3_directorio.DirectorioTelefonico;
import lab1_tp3_directorio.DirectorioTelefonico;
import lab1_tp3_directorio.Domicilio;
import lab1_tp3_directorio.Domicilio;
import lab1_tp3_directorio.Telefono;
import lab1_tp3_directorio.Telefono;

/**
 * @author GRUPO: 10.
 */
public class Lab1_TP3_Directorio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DirectorioTelefonico guiaTe = new DirectorioTelefonico();

        boolean logic = false;

        do {
            logic = false;
            Cliente cliente1 = new Cliente();
            System.out.println("ingrese el nombre del cliente");
            cliente1.setNombre(leer.next());
            System.out.println("ingrese el apellido del cliente");
            cliente1.setApellido(leer.next());
            System.out.println("ingrese el dni del cliente");
            cliente1.setDni(leer.nextInt());

            Domicilio domicilio = new Domicilio();
            System.out.println("ingrese el nombre de la ciudad");
            domicilio.setNombreCiudad(leer.next());
            System.out.println("ingrese el nombre de la calle");
            domicilio.setCalle(leer.next());
            System.out.println("ingrese laq altura de la calle");
            domicilio.setAltura(leer.nextInt());

            cliente1.setDireccion(domicilio);

            Telefono tel1 = new Telefono();
            System.out.println("ingrese el numero de telefono asignado");
            tel1.setNumero(leer.nextLong());
            guiaTe.agregarCliente(tel1, cliente1);
            System.out.println("########################################");
            System.out.println("desea buscar un numero de cliente");
            Long aux = leer.nextLong();
            guiaTe.buscarCliente(aux);
            System.out.println("########################################");
            System.out.println("desea buscar un apellido de cliente");
            String aux2 = leer.next();
            guiaTe.buscarTelefono(aux2);
            System.out.println("########################################");
            System.out.println("ingrese domicilio que desea buscar del cliente");
            String aux3 = leer.next();
            guiaTe.buscarClienteS(aux3);
            System.out.println("########################################");
            System.out.println("ingrese el numero de tel que desea eliminar");
            Long aux4 = leer.nextLong();
            guiaTe.borrarCliente(aux4);

            System.out.println("desea agregar otro cliente S/n");
            String aux1 = leer.next();
            if (aux1.equalsIgnoreCase("s")) {
                logic = true;
            }
        } while (logic == true);
        System.out.println("########################################");
        System.out.println();
        guiaTe.mostrarClientes();

    }

}
