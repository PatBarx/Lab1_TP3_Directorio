package lab1_tp3_directorio;

import java.util.Objects;

public class Cliente {

    private int dni;
    private String nombre;
    private String apellido;
    private Domicilio direccion;

    public Cliente() {
    }

    public Cliente(int dni, String nombre, String apellido, Domicilio direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDireccion() {
        return direccion;
    }

    public void setDireccion(Domicilio direccion) {
        this.direccion = direccion;
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }    

    @Override
    public String toString() {
        return "\nNombre y Apellido:   " + nombre + ' ' + apellido  + "\tDNI: " + dni + "\nDireccion: " + direccion + " - - -  - - - - - - - - \n";
    }   
}
