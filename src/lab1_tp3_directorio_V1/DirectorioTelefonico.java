package lab1_tp3_directorio_V1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DirectorioTelefonico {

    private HashMap<Telefono, Cliente> registro;

    public DirectorioTelefonico() {
        this.registro = new HashMap<>();
    }

    public void agregarCliente(Telefono tel1, Cliente cliente1) {
        registro.put(tel1, cliente1);

    }

    @Override
    public String toString() {
        return "DirectorioTelefonico{" + "registro=" + registro + '}';
    }

    public void buscarCliente(Long aux) {
        for (Map.Entry<Telefono, Cliente> entry : registro.entrySet()) {
            if (entry.getKey().getNumero() == aux) {
                 System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
        //
    }

    public void buscarTelefono(String apellido) {
        for (Map.Entry<Telefono, Cliente> entry : registro.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                System.out.println(entry.getKey());
                //   System.out.println(entry.getValue());
            }
        }
    }

    public void buscarClienteS(String domicilio) {
        for (Map.Entry<Telefono, Cliente> entry : registro.entrySet()) {
            if (entry.getValue().getDireccion().getNombreCiudad().equalsIgnoreCase(domicilio)) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
    }

    public void borrarCliente(long numero) {
        
     registro.entrySet().removeIf(entry->entry.getKey().getNumero()==numero);
        
 
        }
    

    public void mostrarClientes() {
        for (Map.Entry<Telefono, Cliente> entry : registro.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
