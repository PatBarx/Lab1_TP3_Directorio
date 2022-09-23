package lab1_tp3_directorio;

import java.util.HashMap;

public class DirectorioTelefonico {

    private HashMap <Telefono,Cliente> registro;

    public DirectorioTelefonico() {
    }

    public Boolean agregarCliente(Cliente cli, Telefono tel) {
       return registro.put(tel, cli) == null;
    }

    public Cliente buscarCliente(Telefono tel) {
       //
    }

    public List buscarTelefono(Cliente apellido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set buscarClienteS(Domicilio ciudad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean borrarCliente(Telefono tel) {
        return registro.remove(tel) == null;
    }
}
