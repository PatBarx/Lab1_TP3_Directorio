package lab1_tp3_directorio;

public class Telefono {

    private long numero;

    public Telefono(long numero) {
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (this.numero ^ (this.numero >>> 32));
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
        final Telefono other = (Telefono) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }    

    @Override
    public String toString() {
        return "Linea: " + numero + '.';
    }
    
}
