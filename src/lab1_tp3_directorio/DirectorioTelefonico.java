package lab1_tp3_directorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectorioTelefonico {

    private HashMap <Telefono,Cliente> registro;

    public DirectorioTelefonico() {
        registro = new HashMap();
    }

     

    /*public boolean agregarCliente(Cliente cli, Telefono tel) {
        //registra nuevo Cliente con su telefono. (tel, Cliente)
       return registro.put(tel, cli) == null;
    }*/
    
    public Cliente agregarCliente(Cliente cli, Telefono tel) {
        //registra nuevo Cliente con su telefono. (tel, Cliente)        
       return registro.put(tel, cli);
    }
    

    public Cliente buscarCliente(Telefono tel) {
        //Busca por Telefono y devuelve el Cliente asociado al mismo o nada
        
        
//        for (Map.Entry<Telefono, Cliente> entry : registro.entrySet()) {
//            Telefono key = entry.getKey();
//            Cliente value = entry.getValue();
//            if (key.getNumero() == tel) {
//                return value;
//            }            
//        }
        return registro.get(tel);
    }

    public List buscarTelefono(String apellido) {
        //busca por apellido, devuelve CONJUNTO de ns de Tel asociados.
        List<Telefono> numerosAsoc = new ArrayList();
        for (Map.Entry<Telefono, Cliente> entry : registro.entrySet()) {
            Telefono key = entry.getKey();
            Cliente value = entry.getValue();
            if (apellido.equalsIgnoreCase(value.getApellido()) ) {
                numerosAsoc.add(key);
            }            
        }   
        return numerosAsoc;
    }

    public ArrayList buscarClienteS(String ciudad) {
        //busca por ciudad. Devuelve conjunto de Clientes de la Ciudad.
        ArrayList<Cliente> cliCiuList = new ArrayList();
        for (Map.Entry<Telefono, Cliente> entry : registro.entrySet()) {
            Telefono key = entry.getKey();
            Cliente value = entry.getValue();
            if (ciudad.equalsIgnoreCase(value.getDireccion().getNombreCiudad())) {
                cliCiuList.add(value);
            }            
        }
        return cliCiuList;
    }

    public Boolean borrarCliente(Telefono tel) {
        //Borra el cliente en base al numero ingresado.
        return registro.remove(tel) != null;
    }

    @Override
    public String toString() {
        return "- - - - - - - - - - -\nDirectorio Telefonico:\n- - - - - - - - - - -\nRegistro de clientes: \n" + registro + '.';
    }
    
    
}
